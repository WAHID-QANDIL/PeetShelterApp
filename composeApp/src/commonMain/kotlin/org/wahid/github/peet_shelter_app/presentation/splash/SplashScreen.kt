package org.wahid.github.peet_shelter_app.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.theme.SPLASH_ICON_BOX_HEIGHT

import peetshelterapp.composeapp.generated.resources.Res
import peetshelterapp.composeapp.generated.resources.app_background
import peetshelterapp.composeapp.generated.resources.logo

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun SplashScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(Res.drawable.app_background),
            contentDescription = Res.string.splashBackground
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(SPLASH_ICON_BOX_HEIGHT)
                .align(Alignment.TopCenter),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(Res.drawable.logo),
                contentDescription = Res.string.splashScreenIcon
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = Res.string.splashScreenWelcomeText)



        }
    }
}