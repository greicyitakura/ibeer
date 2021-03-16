package br.com.greicyitakura.dhibeer.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R
import br.com.greicyitakura.dhibeer.data.Beer
import br.com.greicyitakura.dhibeer.view.BeerDetailActivity
import br.com.greicyitakura.dhibeer.viewholder.SingleBeercraftViewHolder

class SingleBeercraftAdapter (
    val beerList: List<Beer>
): RecyclerView.Adapter<SingleBeercraftViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SingleBeercraftViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_single_beercraft, parent, false)
        return SingleBeercraftViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SingleBeercraftViewHolder,
        position: Int) {

        val image = holder.beerImg
        image.setImageResource(beerList[position].BeerImg)

        val name = holder.beerName
        name.text = beerList[position].BeerName

        val meal = holder.itemView
        meal.setOnClickListener {
            Log.i("CLICk", "${name.text} meal was selected")
            val intent = Intent(it.context, BeerDetailActivity::class.java)

            intent.putExtra("NAME", beerList[position].BeerName)
            intent.putExtra("IMAGE", beerList[position].BeerImg)
            intent.putExtra("DESC", beerList[position].BeerDescription)
            intent.putExtra("PRICE", beerList[position].BeerPrice)

            it.context.startActivity(intent)
        }

    }

    override fun getItemCount() = beerList.size
}