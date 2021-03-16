package br.com.greicyitakura.dhibeer.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R
import br.com.greicyitakura.dhibeer.data.Beercraft
import br.com.greicyitakura.dhibeer.view.SingleBeercrafttActivity
import br.com.greicyitakura.dhibeer.viewholder.BeercraftViewHolder

class BeercraftAdapter(val beercraft: List<Beercraft>): RecyclerView.Adapter<BeercraftViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeercraftViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_beercrafts, parent, false)
        return BeercraftViewHolder(view)

    }

    override fun onBindViewHolder(
        holder: BeercraftViewHolder,
        position: Int) {

        val image = holder.imgBeercraft
        val singleImage = beercraft[position].BeercraftImg
        image.setImageResource(beercraft[position].BeercraftImg)

        val name = holder.nameBeercraft
        name.text = beercraft[position].BeercraftName
        val singleName = name.text

        val address = holder.addressBeercraft
        address.text = beercraft[position].BeercraftAddress
        val card = holder.itemView
        card.setOnClickListener {
            Log.i("CLICK", "${name.text} was selected")
            val intent = Intent(it.context, SingleBeercrafttActivity::class.java)
            intent.putExtra("IMAGE", beercraft[position].BeercraftImg)
            intent.putExtra("NAME", beercraft[position].BeercraftName)
            it.context.startActivity(intent)

        }
    }

    override fun getItemCount() = beercraft.size
}