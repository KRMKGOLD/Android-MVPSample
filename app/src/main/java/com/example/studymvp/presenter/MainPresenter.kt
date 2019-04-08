package com.example.studymvp.presenter

import android.os.Handler
import android.util.Log
import com.example.studymvp.contract.MainContract
import com.example.studymvp.model.Repo
import com.example.studymvp.model.service.GithubRetroCallback
import com.example.studymvp.model.service.GithubService

class MainPresenter(private val view: MainContract.View?, private val githubService: GithubService) : MainContract.Presenter {
    private var textData : List<Repo>? = null

    inner class RetroCallbackImpl : GithubRetroCallback {
        override fun onError(t: Throwable) {
            Log.d("error", t.toString())
        }

        override fun onSuccess(receivedData: List<Repo>) {
            textData = receivedData
            Log.d("textData", textData.toString())
        }
    }

    override fun getData() {
        val retroCallback = RetroCallbackImpl()

        githubService.getAPI(retroCallback)

        view?.showLoading()

        Handler().postDelayed({
            view?.setText(textData.toString())
        }, 1000)

        view?.hideLoading()
    }

}
