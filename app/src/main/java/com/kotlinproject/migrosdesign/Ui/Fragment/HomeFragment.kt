package com.kotlinproject.migrosdesign.Ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlinproject.migrosdesign.Model.LabelData
import com.kotlinproject.migrosdesign.R
import com.kotlinproject.migrosdesign.Ui.adapter.Home.HomePageAdvertisementAdapter
import com.kotlinproject.migrosdesign.Ui.adapter.Home.LabelCardAdapter
import com.kotlinproject.migrosdesign.Ui.adapter.Home.SmallAdvertisementAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.*

class HomeFragment : Fragment() {
    private lateinit var binding:View
    private lateinit var dataSet: ArrayList<LabelData>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= inflater.inflate(R.layout.fragment_home, container, false)
        dataSet=ArrayList<LabelData>()
        dataSet.add(LabelData("sanalmarket"))
        dataSet.add(LabelData("migroshemen"))

        val rv=binding.rvLabel
        rv.layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rv.adapter= LabelCardAdapter(dataSet,requireContext())

        dataSet=ArrayList<LabelData>()
        dataSet.add(LabelData("migrosyemek"))
        dataSet.add(LabelData("ekstra"))
        dataSet.add(LabelData("tazedirekt"))

        val rvSecond=binding.rvSecondLabel
        rvSecond.layoutManager= StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        rvSecond.adapter= LabelCardAdapter(dataSet,requireContext())
        val cardView = binding.cardView;
        cardView.setBackgroundResource(R.drawable.labelcardbackground);

        dataSet=ArrayList<LabelData>()
        dataSet.add(LabelData("cicekler"))
        dataSet.add(LabelData("ekmekler"))
        dataSet.add(LabelData("fiyatlar"))


        val rvAdvertisement=binding.rvadvertisement
        rvAdvertisement.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        rvAdvertisement.adapter= HomePageAdvertisementAdapter(dataSet,requireContext())

        dataSet=ArrayList<LabelData>()
        dataSet.add(LabelData("img_1"))
        dataSet.add(LabelData("img_1"))
        dataSet.add(LabelData("img_1"))


        val rvSmallAdvertisement=binding.rvSmallAdvertisement
        rvSmallAdvertisement.layoutManager=  LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvSmallAdvertisement.adapter= SmallAdvertisementAdapter(dataSet,requireContext())
        return binding
    }

}