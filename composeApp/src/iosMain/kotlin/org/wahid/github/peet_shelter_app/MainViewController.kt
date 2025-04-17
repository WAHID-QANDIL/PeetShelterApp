package org.wahid.github.peet_shelter_app

import androidx.compose.ui.window.ComposeUIViewController
import androidx.navigation.compose.rememberNavController
import org.wahid.github.peet_shelter_app.navigation.AppNav
import org.wahid.github.peet_shelter_app.presentation.screens.splash.SplashScreen


fun MainViewController() = ComposeUIViewController {
    val navController = rememberNavController()
    AppNav(navController)
}