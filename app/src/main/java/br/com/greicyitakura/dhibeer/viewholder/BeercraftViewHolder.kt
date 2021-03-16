package br.com.greicyitakura.dhibeer.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R

class BeercraftViewHolder (
    view: View
) : RecyclerView.ViewHolder(view) {

    val imgBeercraft by lazy { itemView.findViewById<ImageView>(R.id.image_beercraft01) }
    val nameBeercraft by lazy { itemView.findViewById<TextView>(R.id.name_beercraft01) }
    val addressBeercraft by lazy { itemView.findViewById<TextView>(R.id.address_beercraft01) }
}