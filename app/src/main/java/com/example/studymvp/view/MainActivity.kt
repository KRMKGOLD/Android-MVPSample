package com.example.studymvp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.studymvp.R
import com.example.studymvp.presenter.MainPresenter
import com.example.studymvp.presenter.MainPresenterImpl
import com.example.studymvp.view.recycler.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.View {
//    private lateinit var textArray : ArrayList<String>
//    lateinit var을 이용하고 만약 초기화가 안되면 위험한 코드
    private val presenter : MainPresenter = MainPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        presenter = MainPresenterImpl(this)
        presenter.getItem()

//        val layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//        xml에서 처리 가능

        recyclerView.adapter = MainAdapter(this)
        recyclerView.setHasFixedSize(true)
    }

    override fun setList(list: ArrayList<String>) {
        (recyclerView.adapter as? MainAdapter)?.replaceAll(list)
    }
}