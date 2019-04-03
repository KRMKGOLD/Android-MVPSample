package com.example.studymvp.model.service

import com.example.studymvp.model.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubAPI {
    @GET("/users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>
}