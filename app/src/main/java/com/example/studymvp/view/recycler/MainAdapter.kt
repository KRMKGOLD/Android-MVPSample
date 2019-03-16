package com.example.studymvp.view.recycler

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.studymvp.R

class MainAdapter(val context : Context, val textArray : ArrayList<String>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewGroup: Int): MainViewHolder {
           return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false))
    }

    override fun getItemCount(): Int = textArray.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(textArray[position])
    }

    inner class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvContent = itemView.findViewById<TextView>(R.id.textView)

        fun bind(toBindData : String){
            tvContent.text = toBindData
        }
    }
}