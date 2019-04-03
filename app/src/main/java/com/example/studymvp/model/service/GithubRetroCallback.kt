package com.example.studymvp.model.service

import com.example.studymvp.model.Repo

interface GithubRetroCallback {
    fun onSuccess(receivedData: List<Repo>)
    fun onError(t: Throwable)
}

