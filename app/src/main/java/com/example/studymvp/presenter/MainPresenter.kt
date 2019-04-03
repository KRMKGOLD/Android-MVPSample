package com.example.studymvp.presenter

import android.os.Handler
import android.util.Log
import com.example.studymvp.contract.MainContract
import com.example.studymvp.model.Repo
import com.example.studymvp.model.service.GithubRetroCallback
import com.example.studymvp.model.service.GithubService

class MainPresenter(private val view: MainContract.View?) : MainContract.Presenter {
    private val githubService = GithubService()
    private var textData : List<Repo>? = null

    inner class RetroCallbackImpl : GithubRetroCallback {
        override fun onError(t: Throwable) {
            Log.d("error", t.toString())
        }

        override fun onSuccess(receivedData: List<Repo>) {
            textData = receivedData
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
