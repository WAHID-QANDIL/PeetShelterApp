package org.wahid.github.peet_shelter_app.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Colors {
    val pinkColor = Color(0xFFF2968F)

    val petNameColor
        @Composable
        get() = if (isSystemInDarkTheme()) Color.White else Color.Black

    val petAgeColor
        @Composable
        get() = if (isSystemInDarkTheme()) Color.DarkGray else Color.Gray

    val petDescriptionColor
        @Composable
        get() = if (isSystemInDarkTheme()) Color.DarkGray else Color.Gray

}