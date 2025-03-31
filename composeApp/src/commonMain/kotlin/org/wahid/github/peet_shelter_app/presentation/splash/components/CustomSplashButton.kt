package org.wahid.github.peet_shelter_app.presentation.splash.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.theme.CUSTOM_BUTTON_HEIGHT
import org.wahid.github.peet_shelter_app.theme.CUSTOM_BUTTON_WIDTH

@Composable
fun CustomSplashButton(
    modifier: Modifier = Modifier,
    text:String,
    textColor: Color,
) {

    Box(
        modifier = modifier
            .height(CUSTOM_BUTTON_HEIGHT)
            .width(CUSTOM_BUTTON_WIDTH),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            color = textColor,
            fontWeight = FontWeight.SemiBold,
            fontSize = MaterialTheme.typography.button.fontSize
        )
    }

}
@Preview
@Composable
private fun PreviewCustomSplashButton() {
    CustomSplashButton(
        text = "",
        textColor = Color.White
    )
}