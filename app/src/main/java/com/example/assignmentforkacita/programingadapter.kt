package com.example.assignmentforkacita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class programingadapter (private val programing: List<dataclass>) :RecyclerView.Adapter<programingadapter.programingViewHolder>(){
    class programingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.texti)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): programingViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.programing,parent,false)
        return programingViewHolder(view)
    }


    override fun onBindViewHolder(holder: programingViewHolder, position: Int) {
        val a = programing[position]
        holder.textView.text = a.title
        Glide.with(holder.imageview.context)
            .load(a.url)
            .centerCrop()
            .into(holder.imageview)





    }

    override fun getItemCount(): Int = programing.size


}