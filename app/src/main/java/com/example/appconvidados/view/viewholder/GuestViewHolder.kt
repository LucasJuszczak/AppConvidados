package com.example.appconvidados.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.appconvidados.databinding.RowGuestBinding
import com.example.appconvidados.model.GuestModel

class GuestViewHolder(private val bind: RowGuestBinding) : RecyclerView.ViewHolder(bind.root) {
    fun bind(guest: GuestModel) {
        //Utilizando a classe R do Java
//        itemView.findViewById<TextView>(R.id.text_name).text = guest.name
        //Utilizando viewBinding
        bind.textName.text = guest.name
    }
}