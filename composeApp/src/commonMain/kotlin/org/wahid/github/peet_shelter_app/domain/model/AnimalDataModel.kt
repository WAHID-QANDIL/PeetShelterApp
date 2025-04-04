package org.wahid.github.peet_shelter_app.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimalDataModel(
    @SerialName("breed_group")
    val breedGroup: String?,
    @SerialName("colors")
    val colors: List<String?>?,
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("image")
    val image: String?,
    @SerialName("lifespan")
    val lifespan: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("origin")
    val origin: String?,
    @SerialName("size")
    val size: String?,
    @SerialName("temperament")
    val temperament: String?
)