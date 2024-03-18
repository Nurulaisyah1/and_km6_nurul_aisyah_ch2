package com.example.and_km6_nurulaisyah_ch2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.and_km6_nurulaisyah_ch2.data.Category
import com.example.and_km6_nurulaisyah_ch2.databinding.ListItemCategoryBinding

class CategoryAdapter(private val data : List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(val binding : ListItemCategoryBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ListItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.apply {
            val (_,img,name) = data[position]
            ivCategoryAvatars.setImageResource(img)
            tvName.text = name

        }
    }
}