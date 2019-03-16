package com.example.studymvp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.studymvp.R
import com.example.studymvp.presenter.MainPresenter
import com.example.studymvp.presenter.MainPresenterImpl
import com.example.studymvp.view.recycler.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.View {

    private lateinit var textArray : ArrayList<String>
    private lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenterImpl(this)
        presenter.getItem()

        val mainAdapter = MainAdapter(this, textArray)
        recyclerView.adapter = mainAdapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
    }

    override fun setView(list: ArrayList<String>) {
        textArray = list
    }
}