package org.wahid.github.peet_shelter_app.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimalModel(
    @SerialName("colors")
    val colors: List<String?>?,
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("image")
    val image: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("origin")
    val origin: String?,
    @SerialName("temperament")
    val temperament: String?
)