package com.parade621.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        val items = mutableListOf<String>()
        items.add("노래1")
        items.add("노래2")
        items.add("노래3")
        items.add("노래4")
        items.add("노래5")
        items.add("노래6")
        items.add("노래7")
        items.add("노래8")
        items.add("노래9")
        items.add("노래10")
        items.add("노래11")
        items.add("노래12")
        items.add("노래13")
        items.add("노래14")
        items.add("노래15")

        val rv = view.findViewById<RecyclerView>(R.id.SingRv)
        val rvAdapter = RVAdapter(items)
        rv.adapter=rvAdapter
        rv.layoutManager= LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        return view
    }

}