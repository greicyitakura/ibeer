package br.com.greicyitakura.dhibeer.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R
import br.com.greicyitakura.dhibeer.adapter.SingleBeercraftAdapter
import br.com.greicyitakura.dhibeer.data.Data

class SingleBeercrafttActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_beercraftt)

        val single_recycler_view by lazy { findViewById<RecyclerView>(R.id.single_recycler_view) }
        val single_beercraft_image by lazy { findViewById<ImageView>(R.id.single_beercraft_image) }
        val single_beercraft_name by lazy { findViewById<TextView>(R.id.single_beercraft_name) }
        val arrowBack by lazy { findViewById<ImageButton>(R.id.back_button) }

        val beercraft = intent.extras
        val name = beercraft?.getString("NAME")
        val image = beercraft?.getInt("IMAGE")

        image?.let { single_beercraft_image.setImageResource(it) }
        single_beercraft_name.text = name!!

        val resObjects = Data.data().find { it.BeercraftName.equals(name) }
        val beerList = resObjects?.BeercraftMenus


        single_recycler_view.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        single_recycler_view.adapter = beerList?.let { SingleBeercraftAdapter(it) }

        arrowBack.setOnClickListener { onBackPressed() }


    }
}