package com.kotlinproject.migrosdesign.Ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlinproject.migrosdesign.Model.CategoryData
import com.kotlinproject.migrosdesign.R
import com.kotlinproject.migrosdesign.Ui.adapter.CategoryCardAdapter
import java.util.*


class CategoryFragment : Fragment() {
    private lateinit var tasarim:View
    private lateinit var dataSet: ArrayList<CategoryData>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim=inflater.inflate(R.layout.fragment_category, container, false)
        //img.setBackgroundResource(R.drawable.onboard);
        dataSet=ArrayList<CategoryData>()
        dataSet.add(CategoryData("Meyve,Sebze","sebze"))
        dataSet.add(CategoryData("Et, Tavuk, Balık","et"))
        dataSet.add(CategoryData("Süt, Kahvaltılık","sut"))
        dataSet.add(CategoryData("Temel Gıda","temel_gida"))
        dataSet.add(CategoryData("Meze, Hazır Yemek, Donuk","meze"))
        dataSet.add(CategoryData("Fırın, Pastane","firin"))
        dataSet.add(CategoryData("Atıştırmalık","atistirmalik"))
        dataSet.add(CategoryData("İçecek","icicek"))
        dataSet.add(CategoryData("Deterjan, Temizlik","deterjan"))
        dataSet.add(CategoryData("Kişisel Bakım, Kozmetik","bakim"))
        dataSet.add(CategoryData("Bebek","bebek"))
        dataSet.add(CategoryData("Ev, Yaşam","ev"))
        dataSet.add(CategoryData("Kitap, Kırtasiye, Oyuncak","kirtasiye"))
        dataSet.add(CategoryData("Çiçek","cicek"))
        dataSet.add(CategoryData("Pet Shop","petshop"))
        dataSet.add(CategoryData("Elektronik","elektronik"))

        val rv: RecyclerView =tasarim.findViewById(R.id.categoryRecycleView)
        rv.layoutManager= StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        rv.adapter= CategoryCardAdapter(dataSet,requireContext())

        return tasarim
    }


}