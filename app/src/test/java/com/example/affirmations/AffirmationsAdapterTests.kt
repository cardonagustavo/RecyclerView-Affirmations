package com.example.affirmations

import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.manipulation.Ordering
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
}

private val context = mock(Ordering.Context::class.java)

@Test
fun adapter_size(): Unit {
    val data = listOf(
        Affirmation(R.string.affirmation1, R.drawable.image1),
        Affirmation(R.string.affirmation2, R.drawable.image2)
    )

    val adapter  = ItemAdapter(context, data)
    assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

}

