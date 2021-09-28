package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studyapp.databinding.ItemRowBinding

class RecyclerViewAdapter(private val items: ArrayList<ArrayList<String>>, val activity: Activity) :
    RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRowBinding.inflate(LayoutInflater.from(activity), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {
            val title = items[position][0]
            val desc = items[position][1]
            val details = items[position][2]

            titleCardView.text = title
            descCardView.text = desc
            cardView.setOnClickListener {
                DetailsDialog(title, details, activity)
            }
        }
    }

    override fun getItemCount() = items.size

}
//DEPRECATED
//package com.example.studyapp
//
//import android.app.Activity
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.item_row.view.*
//
//class RecyclerViewAdapter(private val items: ArrayList<ArrayList<String>>, val activity: Activity): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(
//            LayoutInflater.from(parent.context).inflate(
//                R.layout.item_row,
//                parent,
//                false
//            )
//        )
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.itemView.apply {
//            val title = items[position][0]
//            val desc = items[position][1]
//            val details = items[position][2]
//
//            title_card_view.text = title
//            desc_card_view.text = desc
//            card_view.setOnClickListener {
//                DetailsDialog(title, details, activity)
//            }
//        }
//    }
//
//    override fun getItemCount() = items.size
//}