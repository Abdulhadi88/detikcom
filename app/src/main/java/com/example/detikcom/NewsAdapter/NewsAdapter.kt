package com.example.detikcom.NewsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikcom.R
import kotlinx.android.synthetic.main.activity_main.view.*

class NewsAdapter (val context: Context, val listnews: List<news>):
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentNews: news? = null
        var currentPosition : Int = 0

        fun setData(curnnews: news, pos:Int){
            itemView.tvw_TitleHeadLine.text = curnnews!!.title
            itemView.tvw_DescHeadline.text = curnnews!!.title
            itemView.img_news0.setImageResource(currentNews!!.Photo)

            this.currentNews
            this.currentPosition

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)
    }

}