package br.com.greicyitakura.dhibeer.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import br.com.greicyitakura.dhibeer.R

class BeerDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beer_detail)

        val beerName by lazy { findViewById<TextView>(R.id.beer__detail_name) }
        val beerDesc by lazy { findViewById<TextView>(R.id.beer_detail_description) }
        val beerImg by lazy { findViewById<ImageView>(R.id.beer_detail_image) }
        val backButton by lazy { findViewById<ImageButton>(R.id.back_button) }

        val beer = intent.extras
        val name = beer?.getString("NAME")
        val image = beer?.getInt("IMAGE")
        val desc = beer?.getString("DESC")

        beerName.text = name
        beerDesc.text = desc
        beerImg.setImageResource(image!!)

        backButton.setOnClickListener { onBackPressed() }

    }
}