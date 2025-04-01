package org.wahid.github.peet_shelter_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.presentation.screens.home.HomeScreen
import org.wahid.github.peet_shelter_app.presentation.screens.splash.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HomeScreen()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    SplashScreen()
}