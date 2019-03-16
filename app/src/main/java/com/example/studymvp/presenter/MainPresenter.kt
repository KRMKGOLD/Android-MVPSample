package com.example.studymvp.presenter

// Google Architecture와 같은 방식이긴 함, 단지 Presenter에서 inner interface로 사용되는 것

interface MainPresenter {
    fun getItem()

    interface View {
        fun setList(list : ArrayList<String>)
    }
}
