package org.wahid.github.peet_shelter_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.createGraph
import androidx.navigation.navArgument
import androidx.navigation.toRoute
import org.wahid.github.peet_shelter_app.domain.model.AnimalDataModelNavType
import org.wahid.github.peet_shelter_app.presentation.screens.home.HomeScreen
import org.wahid.github.peet_shelter_app.presentation.screens.splash.SplashScreen


@Composable
fun AppNav(
    navHostController: NavHostController,
) {

    val navHost = navHostController
    val graph = navHost.createGraph(
        startDestination = Screen.Splash
    ) {
        composable<Screen.Splash> {
            SplashScreen(
                navHostController = navHost
            )
        }
        composable<Screen.Home> {
            HomeScreen()
        }
        composable(
            route = "details{animal}",
            arguments = listOf(navArgument("animal") {
                type = AnimalDataModelNavType
            })
        )
        { backStack ->
            val route = backStack.toRoute<AnimalDataModelNavType>()

        }

    }

    NavHost(
        navController = navHost,
        graph = graph
    )

}