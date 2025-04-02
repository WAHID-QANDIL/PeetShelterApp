package org.wahid.github.peet_shelter_app.domain.model

import androidx.core.bundle.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class AnimalDataModel(
    val name: String,
)

object AnimalDataModelNavType : NavType<AnimalDataModel>(isNullableAllowed = false) {
    override fun serializeAsValue(value: AnimalDataModel): String {
        return Json.encodeToString(value = value)
    }

    override fun get(bundle: Bundle, key: String): AnimalDataModel? {
        return parseValue(bundle.getString(key)!!)
    }

    override fun parseValue(value: String): AnimalDataModel {
        return Json.decodeFromString(value)
    }

    override fun put(bundle: Bundle, key: String, value: AnimalDataModel) {
        bundle.putString(key, serializeAsValue(value))
    }
}
