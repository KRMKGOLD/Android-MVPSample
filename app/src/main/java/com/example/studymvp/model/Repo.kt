package com.example.studymvp.model

import com.google.gson.annotations.SerializedName

data class Repo(
    @SerializedName("html_url")
    val htmlUrl: String? = null,

    @SerializedName("name")
    val name: String? = null
)