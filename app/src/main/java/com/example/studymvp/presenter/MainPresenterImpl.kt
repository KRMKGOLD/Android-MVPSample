package com.example.studymvp.presenter

class MainPresenterImpl(private val view : MainPresenter.View) : MainPresenter {
    override fun getItem() {
        val list = arrayListOf<String>("aaa", "bbb", "ccc", "ddd", "eee")
        view.setList(list)
    }
}