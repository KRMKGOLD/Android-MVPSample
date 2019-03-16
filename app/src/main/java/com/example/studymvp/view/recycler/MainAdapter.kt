package com.example.studymvp.view.recycler

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.studymvp.R

class MainAdapter(val context: Context) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    private val textArray = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewGroup: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false))
    }

    override fun getItemCount(): Int = textArray.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(textArray[position])
    }

    fun replaceAll(list : ArrayList<String>){
        textArray.clear()
        textArray.addAll(list)
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvContent = itemView.findViewById<TextView>(R.id.textView)

        fun bind(toBindData: String) {
            tvContent.text = toBindData
        }
    }
}