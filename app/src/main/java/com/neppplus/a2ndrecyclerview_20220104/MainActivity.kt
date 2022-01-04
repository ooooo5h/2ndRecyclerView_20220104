package com.neppplus.a2ndrecyclerview_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.a2ndrecyclerview_20220104.models.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

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
    }
}