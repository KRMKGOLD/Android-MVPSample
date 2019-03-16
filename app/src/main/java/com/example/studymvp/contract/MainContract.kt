package com.example.studymvp.contract

interface MainContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun setImage(drawable : Int)
    }

    interface Presenter {
        fun getImage()
//        fun setView(view : View)
//        Android Architecture Blueprint 에서는 View 자체를 생성자 쪽에서 Contract.View를 넘긴다.
    }
}