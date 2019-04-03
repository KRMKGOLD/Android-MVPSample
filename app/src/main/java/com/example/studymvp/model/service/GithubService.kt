package com.example.studymvp.model.service

import com.example.studymvp.model.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GithubService {
    lateinit var retrofit: Retrofit

    fun getAPI(callback : GithubRetroCallback) {

        val URL = "https://api.github.com/"

        retrofit = Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val githubService = retrofit.create(GithubAPI::class.java)
        val request = githubService.listRepos("KRMKGOLD")

        request.enqueue(object : Callback<List<Repo>> {
            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                callback.onError(t)
            }

            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
                if (response.isSuccessful) {
                    callback.onSuccess(response.body()!!)
                }
            }
        })

    }
}