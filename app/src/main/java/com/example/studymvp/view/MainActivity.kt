package com.example.studymvp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.studymvp.R
import com.example.studymvp.contract.MainContract
import com.example.studymvp.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var mainPresenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this@MainActivity)

        button.setOnClickListener {
            mainPresenter.getData()
        }
    }

    override fun setText(textData : String) {
        textView.text = textData
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }
}