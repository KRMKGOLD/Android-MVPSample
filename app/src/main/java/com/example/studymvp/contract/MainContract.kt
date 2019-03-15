package com.example.studymvp.contract

interface MainContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun setImage(drawable : Int)
    }

    interface Presenter {
        fun getImage()
        fun setView(view : View)
    }
}