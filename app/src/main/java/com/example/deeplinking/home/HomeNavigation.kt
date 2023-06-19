package com.example.deeplinking.home

import android.content.Intent
import androidx.navigation.*
import androidx.navigation.compose.composable


const val homeNavigationRoute = "home_route"

fun NavGraphBuilder.homeScreen() {
    composable(
        route = homeNavigationRoute,
        deepLinks = listOf(navDeepLink {
            uriPattern = "singh://jasi/dashboard/{name}"
            action = Intent.ACTION_VIEW
        }),
        arguments = listOf(
            navArgument("name") {
                type = NavType.StringType
                defaultValue = ""
            }
        )
    ) { navBackStackEntry ->
        val argument = navBackStackEntry.arguments?.getString("name")
        HomeScreenRoute(deepLinkData = argument)
    }
}