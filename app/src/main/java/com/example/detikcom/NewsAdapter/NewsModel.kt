package com.example.detikcom.NewsAdapter

import com.example.detikcom.R

data class news (var title: String, var desc: String, var detail: String, var Photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news("contoh 1",
            "DetikCom | 1 jam yang lalu",
            "ini adalah hasil detail",
            R.drawable.img_news1),

        news("contoh 2",
        "DetikCom | 1 jam yang lalu",
        "ini adalah hasil detail",
        R.drawable.img_news2),

        news("contoh3",
        "DetikCom | 1 jam yang lalu",
        "ini adalah hasil detal",
        R.drawable.img_news3),

        news("contoh 4",
        "DetikCom | 1 jam yang lalu",
        "ini adalah  hasil detail",
        R.drawable.img_news4)
    )

}