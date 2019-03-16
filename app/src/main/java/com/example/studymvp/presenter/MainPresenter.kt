package com.example.studymvp.presenter

import android.os.Handler
import com.example.studymvp.R
import com.example.studymvp.contract.MainContract
import java.util.*

class MainPresenter(private val view : MainContract.View?) : MainContract.Presenter {
//    private var mainView : MainContract.View? = null
//    override fun setView(view: MainContract.View) {
//        this.mainView = view
//    }

    private val imageArray : ArrayList<Int> = arrayListOf(R.drawable.sample_01, R.drawable.sample_02, R.drawable.sample_03)

    override fun getImage() {
//        val random = Random().nextInt(3)
//        코드 간결화 - 한번만 사용하는 것은 줄일 수 있으면 줄여서 사용
        view?.showLoading()

        Handler().postDelayed({
//            view?.setImage(imageArray[random])
            view?.setImage(imageArray[Random().nextInt(3)])
            view?.hideLoading()
        }, 1000)
    }
}