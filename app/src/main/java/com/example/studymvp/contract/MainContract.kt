package com.example.studymvp.contract

interface MainContract {
    interface View {
        fun setText(textData : String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun getData()
    }
}