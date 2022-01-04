package com.neppplus.a2ndrecyclerview_20220104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a2ndrecyclerview_20220104.R
import com.neppplus.a2ndrecyclerview_20220104.models.Student

class StudentAdapter(
    val mContext : Context,
    val mList : List<Student>
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {

//        한 줄에 해당하는 정보들 변수로 담기

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

//        어떤 xml을 보여줄거야?
//        1 : 한 줄을 표현하는 xml(student_list_item)을 가지고, inflate(?? xml에 표기된 레이아웃들을 메모리에 로딩된 후 객체화 시키는 과정)
//        쉽게 말하면, layout에 그때 그때 다른 layout을 집어 넣을 수 있는 작업

        val row = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, parent, false)

//        2 : 한 줄을 MyViewHolder에 담아서 리턴
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

//        getItemCount : 총 몇줄의 목록이 나올꺼야?

        return mList.size

    }
}