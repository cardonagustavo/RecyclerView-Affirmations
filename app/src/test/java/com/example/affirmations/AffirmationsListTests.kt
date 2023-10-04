package com.example.affirmations

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Clase de prueba para realizar pruebas en la lista de afirmaciones (AffirmationsList).
 * Utiliza la regla ActivityScenarioRule para lanzar la actividad MainActivity.
 */
@get:Rule
val activity = ActivityScenarioRule(MainActivity::class.java)

/**
 * Clase de prueba que utiliza AndroidJUnit4 para ejecutar pruebas de interfaz de usuario en Android.
 */
@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {

}