package com.example.studymvp.presenter

interface MainPresenter {
    fun getItem()

    interface View {
        fun setView(list : ArrayList<String>)
    }
}
