package com.kotlinproject.migrosdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlinproject.migrosdesign.Model.AccountData
import com.kotlinproject.migrosdesign.Model.CategoryData
import com.kotlinproject.migrosdesign.Model.LabelData
import com.kotlinproject.migrosdesign.Ui.adapter.AccountAdapter
import com.kotlinproject.migrosdesign.Ui.adapter.LabelCardAdapter
import kotlinx.android.synthetic.main.fragment_accaunt.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.*


class AccauntFragment : Fragment() {
    private lateinit var binding:View
    private lateinit var dataSet: ArrayList<AccountData>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=inflater.inflate(R.layout.fragment_accaunt, container, false)
        dataSet=ArrayList<AccountData>()
        dataSet.add(AccountData("Meyve,Sebze","contact"))
        dataSet.add(AccountData("Et, Tavuk, Balık","shoppingbag"))
        dataSet.add(AccountData("Meyve,Sebze","love"))
        dataSet.add(AccountData("Et, Tavuk, Balık","gift"))
        dataSet.add(AccountData("Meyve,Sebze","setting"))
        dataSet.add(AccountData("Et, Tavuk, Balık","health"))
        dataSet.add(AccountData("Et, Tavuk, Balık","headphone"))



        val rv=binding.rvProfil
        rv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rv.adapter= AccountAdapter(dataSet,requireContext())

        return binding
    }


}