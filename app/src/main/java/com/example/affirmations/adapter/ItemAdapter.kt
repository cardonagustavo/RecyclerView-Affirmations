package com.example.affirmations.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.MainActivity
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import org.junit.runner.manipulation.Ordering

/**
 * Adaptador para el [RecyclerView] en [MainActivity]. Muestra objetos de datos [Affirmation].
 */
class ItemAdapter(
    private val context: Ordering.Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Proporciona una referencia a las vistas para cada elemento de datos.
    // Los elementos de datos complejos pueden necesitar más de una vista por elemento,
    // y se proporciona acceso a todas las vistas para un elemento de datos en un ViewHolder.
    // Cada elemento de datos es simplemente un objeto Affirmation.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Crea nuevas vistas (invocado por el administrador de diseño).
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Crea una nueva vista
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Reemplaza el contenido de una vista (invocado por el administrador de diseño).
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Devuelve el tamaño de tu conjunto de datos (invocado por el administrador de diseño).
     */
    override fun getItemCount() = dataset.size
}
