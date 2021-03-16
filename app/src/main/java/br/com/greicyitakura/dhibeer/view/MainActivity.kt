package br.com.greicyitakura.dhibeer.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.greicyitakura.dhibeer.R
import br.com.greicyitakura.dhibeer.adapter.BeercraftAdapter
import br.com.greicyitakura.dhibeer.data.Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beercraft_recicler_view by lazy { findViewById<RecyclerView>(R.id.main_activity_recycler_view) }

        val beercraftList = Data.data()
        Log.i("DATA","Requisition of restaurants data is completed")

        beercraft_recicler_view.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)

        beercraft_recicler_view.adapter = BeercraftAdapter(beercraftList)

    }
}