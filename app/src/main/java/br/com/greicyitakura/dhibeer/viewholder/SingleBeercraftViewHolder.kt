package br.com.greicyitakura.dhibeer.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R

class SingleBeercraftViewHolder (
    view: View
): RecyclerView.ViewHolder(view) {

    val beerImg by lazy { itemView.findViewById<ImageView>(R.id.beer_image)}
    val beerName by lazy { itemView.findViewById<TextView>(R.id.beer_name) }

}