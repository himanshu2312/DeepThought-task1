package com.himanshu.deepthoughtapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.himanshu.deepthoughtapp.R

class ProjectAdapter(context: Context) : Adapter<ProjectAdapter.ProjectViewHolder>() {
    class ProjectViewHolder(view: View): RecyclerView.ViewHolder(view){
       val image: ImageView=view.findViewById(R.id.imgProject)
        val textH1: TextView=view.findViewById(R.id.txtH1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_project,parent,false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 10
    }
}