package org.wahid.github.peet_shelter_app.utils.ui_state

import org.wahid.github.peet_shelter_app.domain.model.AnimalDataModel

sealed class HomeUiState {
    data object Loading: HomeUiState()
    data class Success(val animalList: AnimalDataModel): HomeUiState()
    data class Error(val exception: Throwable): HomeUiState()
}