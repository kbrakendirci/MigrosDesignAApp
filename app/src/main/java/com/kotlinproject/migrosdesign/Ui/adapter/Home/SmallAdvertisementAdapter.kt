package com.kotlinproject.migrosdesign.Ui.adapter.Home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.migrosdesign.Model.LabelData
import com.kotlinproject.migrosdesign.R

class SmallAdvertisementAdapter  (var dataSet:List<LabelData>, var mContext: Context)
    : RecyclerView.Adapter<SmallAdvertisementAdapter .SmallAdvertisementHolder>(){
    inner class SmallAdvertisementHolder(view: View): RecyclerView.ViewHolder(view){
        var advertisementImageView: ImageView
        init {

            advertisementImageView=view.findViewById(R.id.imageCampaignCard)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmallAdvertisementHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.homeadvertisementcarditem,parent,false)
        return SmallAdvertisementHolder(tasarim)
    }

    override fun onBindViewHolder(holder: SmallAdvertisementHolder, position: Int) {
        val category=dataSet[position]
        holder.advertisementImageView.setImageResource(mContext.resources.getIdentifier(category.labelImage,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}