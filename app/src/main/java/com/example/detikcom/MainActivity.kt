package com.example.detikcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detikcom.NewsAdapter.NewsAdapter
import com.example.detikcom.NewsAdapter.NewsModel
import com.example.detikcom.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region headline

        var headlinenews: news?
        if(NewsModel.newslist.size>0){
            headlinenews = NewsModel.newslist[NewsModel.newslist.size-1]
            tvw_TitleHeadLine.setText(headlinenews.title)
            tvw_DescHeadline.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.Photo)
        }

            //enregion

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newslist)
        rcv_daftarberita.adapter = newsAdapter
    }
}