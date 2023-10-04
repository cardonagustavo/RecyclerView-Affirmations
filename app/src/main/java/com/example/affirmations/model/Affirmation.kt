package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Clase de modelo que representa una afirmación positiva.
 *
 * @param stringResourceId ID de recurso de cadena para el texto de la afirmación.
 * @param imageResourceId ID de recurso de imagen para una imagen asociada a la afirmación.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
