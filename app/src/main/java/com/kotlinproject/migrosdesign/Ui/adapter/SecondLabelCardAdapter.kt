package com.kotlinproject.migrosdesign.Ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.migrosdesign.Model.LabelData
import com.kotlinproject.migrosdesign.R

class SecondLabelCardAdapter (var dataSet:List<LabelData>, var mContext: Context)
    : RecyclerView.Adapter<SecondLabelCardAdapter.LabelCardViewHolder>(){
    inner class LabelCardViewHolder(view: View): RecyclerView.ViewHolder(view){
        var categoryImageView: ImageView
        init {
            categoryImageView=view.findViewById(R.id.labelImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LabelCardViewHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.labelcardviewdesign,parent,false)
        return LabelCardViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: LabelCardViewHolder, position: Int) {
        val category=dataSet[position]
        holder.categoryImageView.setImageResource(mContext.resources.getIdentifier(category.labelImage,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}