package com.example.affirmations

import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.manipulation.Ordering
import org.mockito.Mockito.mock

/**
 * Clase de prueba para realizar pruebas en el adaptador Affirmations.
 * Utiliza Mockito para crear un contexto ficticio y verificar el tamaño del adaptador.
 */
class AffirmationsAdapterTests {
}

// Se crea un contexto ficticio utilizando Mockito para las pruebas.
private val context = mock(Ordering.Context::class.java)

/**
 * Prueba que verifica si el tamaño del adaptador (ItemCount) coincide con el tamaño de los datos de afirmación.
 */
@Test
fun adapter_size(): Unit {
    // Se crea una lista de datos de afirmación simulados.
    val data = listOf(
        Affirmation(R.string.affirmation1, R.drawable.image1),
        Affirmation(R.string.affirmation2, R.drawable.image2)
    )

    // Se crea un adaptador utilizando los datos simulados.
    val adapter  = ItemAdapter(context, data)

    // Se verifica que el tamaño del adaptador sea igual al tamaño de los datos de afirmación.
    assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
}
