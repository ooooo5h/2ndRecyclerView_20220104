package com.neppplus.a2ndrecyclerview_20220104.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a2ndrecyclerview_20220104.models.Student

class StudentAdapter(
    val mContext : Context,
    val mList : List<Student>
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

//        getItemCount : 총 몇줄의 목록이 나올꺼야?

        return mList.size

    }
}