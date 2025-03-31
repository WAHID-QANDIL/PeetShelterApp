package org.wahid.github.peet_shelter_app.presentation.splash.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.theme.CUSTOM_BUTTON_HEIGHT
import org.wahid.github.peet_shelter_app.theme.LARGE_ROUNDED_CORNER_SIZE

@Composable
fun CustomSplashButton(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    onClick: () -> Unit,
) {

//    Surface(
//        modifier = modifier.clickable { onClick() }
//            .fillMaxWidth(fraction = 0.6f)
//            .height(CUSTOM_BUTTON_HEIGHT)
//            .background(
//                color = Color.Transparent,
//                shape = RoundedCornerShape(LARGE_ROUNDED_CORNER_SIZE)
//            ),
////        shape = RoundedCornerShape(corner = CornerSize(LARGE_ROUNDED_CORNER_SIZE)),
//        shape = RoundedCornerShape(LARGE_ROUNDED_CORNER_SIZE),
//        color = backgroundColor,
//
//        ) {
//        Text(
//            modifier = Modifier.fillMaxSize(),
//            text = text,
//            color = textColor,
//            fontWeight = FontWeight.SemiBold,
//            fontSize = MaterialTheme.typography.button.fontSize,
//        )
//    }
//
//}

    Button(
        modifier = Modifier
            .fillMaxWidth(fraction = .6f)
            .height(CUSTOM_BUTTON_HEIGHT),
        onClick = onClick,
        shape = RoundedCornerShape(LARGE_ROUNDED_CORNER_SIZE),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
        )

    ) {
        Text(
            text = text,
            color = textColor,
            fontWeight = FontWeight.SemiBold,
            fontSize = MaterialTheme.typography.button.fontSize,
        )

    }


}

@Preview
@Composable
private fun PreviewCustomSplashButton() {
    CustomSplashButton(
        text = "",
        textColor = Color.White,
        backgroundColor = Color.White,
        onClick = {}
    )
}