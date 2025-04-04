package org.wahid.github.peet_shelter_app.navigation

import kotlinx.serialization.Serializable
import org.wahid.github.peet_shelter_app.domain.model.AnimalDataModel

sealed class Screen {
    @Serializable
    data object Splash : Screen()
    @Serializable
    class Home : Screen()
    @Serializable
    data class Details(val animalId: Int) : Screen()
}