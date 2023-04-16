package com.himanshu.deepthoughtapp.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.himanshu.deepthoughtapp.R
import com.himanshu.deepthoughtapp.adapter.ProjectAdapter

class ExplorerFragment : Fragment() {
    private lateinit var rvProjects: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_explorer, container, false)
        rvProjects=view.findViewById(R.id.rvProject)
        rvProjects.adapter=ProjectAdapter(activity as Context)
        rvProjects.layoutManager=LinearLayoutManager(activity as Context)

        return view
    }


}