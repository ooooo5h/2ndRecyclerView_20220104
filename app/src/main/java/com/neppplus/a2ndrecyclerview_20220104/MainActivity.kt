package com.neppplus.a2ndrecyclerview_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.neppplus.a2ndrecyclerview_20220104.adapters.StudentAdapter
import com.neppplus.a2ndrecyclerview_20220104.models.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

//    화면이 만들어지고 나서, 어댑터 객체를 대입해주기위한 lateinit var 생성
   lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("유아인", 1990, "서울시 광진구"))
        mStudentList.add( Student("안영미", 1991, "서울시 서초구"))
        mStudentList.add( Student("류준열", 1992, "서울시 중랑구"))
        mStudentList.add( Student("김현준", 1993, "서울시 동대문구"))
        mStudentList.add( Student("서장훈", 1994, "서울시 구로구"))
        mStudentList.add( Student("민경훈", 1995, "서울시 영등포구"))
        mStudentList.add( Student("문세윤", 1996, "서울시 강남구"))
        mStudentList.add( Student("이이경", 1997, "서울시 송파구"))
        mStudentList.add( Student("데프콘", 1998, "서울시 성북북구"))

        mAdapter = StudentAdapter(this, mStudentList)

        studentRecyclerView.adapter = mAdapter
        studentRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}