package com.kotlinproject.migrosdesign.Ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.migrosdesign.Model.AccountData
import com.kotlinproject.migrosdesign.Model.LabelData
import com.kotlinproject.migrosdesign.R

class AccountAdapter(var dataSet:List<AccountData>, var mContext: Context)
    : RecyclerView.Adapter<AccountAdapter.AccountAdapterViewHolder>(){
    inner class AccountAdapterViewHolder(view: View): RecyclerView.ViewHolder(view){
        var  accountImageView : ImageView
        var accountTextView: TextView

        init {
            accountImageView = view.findViewById(R.id.accountIcon)
            accountTextView=view.findViewById(R.id.accountText)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountAdapterViewHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.accountitem,parent,false)
        return AccountAdapterViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: AccountAdapterViewHolder, position: Int) {
        val account=dataSet[position]
        holder.accountImageView.setImageResource(mContext.resources.getIdentifier(account.accountImage,"drawable",mContext.packageName))
        holder.accountTextView.text=account.accountName

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}