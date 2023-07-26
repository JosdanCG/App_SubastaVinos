package com.daniel.jdcg_eva03

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daniel.jdcg_eva03.databinding.ItemWhiskiBinding
import com.daniel.jdcg_eva03.model.Whisky

class RVWhiskiListAdapter(var whiski: List<Whisky>):RecyclerView.Adapter<WhiskiVH>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhiskiVH {
        val binding = ItemWhiskiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WhiskiVH(binding)
    }

    override fun getItemCount(): Int = whiski.size

    override fun onBindViewHolder(holder: WhiskiVH, position: Int) {
        holder.bind(whiski[position])
    }
}

class WhiskiVH(private var binding: ItemWhiskiBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(whiski: Whisky){
        binding.txtName.text= whiski.auction_name
        binding.txtMax.text= whiski.winning_bid_max.toString()
        binding.txtMin.text= whiski.winning_bid_mean.toString()
        binding.txtFecha.text= whiski.dt
    }

}
