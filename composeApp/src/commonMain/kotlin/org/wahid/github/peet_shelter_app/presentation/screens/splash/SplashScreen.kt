package org.wahid.github.peet_shelter_app.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.presentation.screens.splash.components.CustomSplashButton
import org.wahid.github.peet_shelter_app.theme.Colors
import org.wahid.github.peet_shelter_app.theme.MEDIUM_PADDING
import org.wahid.github.peet_shelter_app.theme.SPLASH_ICON_BOX_HEIGHT
import org.wahid.github.peet_shelter_app.theme.Strings

import peetshelterapp.composeapp.generated.resources.Res
import peetshelterapp.composeapp.generated.resources.app_background
import peetshelterapp.composeapp.generated.resources.logo

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun SplashScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(Res.drawable.app_background),
            contentDescription = Strings.splashBackground
        )

        Box(
            modifier = Modifier
                .fillMaxWidth().systemBarsPadding()
                .height(SPLASH_ICON_BOX_HEIGHT)
                .align(Alignment.TopCenter),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(Res.drawable.logo),
                contentDescription = Strings.splashScreenIcon,
                tint = Color.White
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .navigationBarsPadding()
                .padding(vertical = MEDIUM_PADDING),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = Strings.splashScreenWelcomeText,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(MEDIUM_PADDING))

            CustomSplashButton(
                text = Strings.buttonText,
                textColor = Color.White,
                backgroundColor = Colors.pinkColor,
                onClick = {}

            )


        }
    }
}