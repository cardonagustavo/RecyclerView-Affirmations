package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

/**
 * Esta es la actividad principal de la aplicación Affirmations.
 * Muestra una lista de afirmaciones positivas en un RecyclerView.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Se llama cuando se crea la actividad.
     * @param savedInstanceState El estado guardado anteriormente de la actividad, si lo hay.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carga el conjunto de datos de afirmaciones desde la fuente de datos.
        val myDataset = Datasource().loadAffirmations()

        // Encuentra el RecyclerView en el diseño de la actividad.
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // Configura un adaptador personalizado para el RecyclerView.
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Establece que el tamaño del RecyclerView se mantenga constante.
        recyclerView.setHasFixedSize(true)
    }
}
