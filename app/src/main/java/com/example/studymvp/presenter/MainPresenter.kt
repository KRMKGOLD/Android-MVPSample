package com.example.studymvp.presenter

import android.os.Handler
import com.example.studymvp.R
import com.example.studymvp.contract.MainContract
import java.util.*

class MainPresenter : MainContract.Presenter {
    private var mainView : MainContract.View? = null

    override fun setView(view: MainContract.View) {
        this.mainView = view
    }

    override fun getImage() {
        val imageArray : ArrayList<Int> = arrayListOf(R.drawable.sample_01, R.drawable.sample_02, R.drawable.sample_03)
        val random = Random().nextInt(3)

        mainView?.showLoading()

        Handler().postDelayed({
            mainView?.setImage(imageArray[random])
            mainView?.hideLoading()
        }, 1000)
    }
}