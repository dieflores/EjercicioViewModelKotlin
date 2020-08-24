package com.example.ejercicioviewmodelkotlingrupal.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicioviewmodelkotlingrupal.R
import com.example.ejercicioviewmodelkotlingrupal.modelo.Drinks

class RecyclerDrinkAdapter(var list: MutableList<Drinks>)
    :RecyclerView.Adapter<RecyclerDrinkAdapter.Holder>(){

    class Holder(view: View):RecyclerView.ViewHolder(view){
        lateinit var name:TextView
        lateinit var price:TextView
        lateinit var quantity:TextView
    }

    fun update(list:MutableList<Drinks>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.drunk_adapter_layout,parent, false)
        var holder:Holder = Holder(view)
        holder.name  = view.findViewById(R.id.drink_name)
        holder.price = view.findViewById(R.id.drink_price)
        holder.quantity = view.findViewById(R.id.drink_quantity)

        return holder
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}