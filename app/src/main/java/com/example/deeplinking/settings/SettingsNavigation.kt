package com.example.deeplinking.settings


import android.content.Intent
import androidx.navigation.*
import androidx.navigation.compose.composable

const val settingsNavigationRoute = "settings_route"

fun NavController.navigateSettingsScreen(navOptions: NavOptions? = null) {
    this.navigate(settingsNavigationRoute, navOptions)
}

fun NavGraphBuilder.settingsScreen() {
    composable(
        route = settingsNavigationRoute,
        deepLinks = listOf(navDeepLink {
            uriPattern = "singh://jasi/settings/{id}"
            action = Intent.ACTION_VIEW
        }),
        arguments = listOf(
            navArgument("id") {
                type = NavType.StringType
                defaultValue = ""
            }
        )
    ) { navBackStackEntry ->
        val argument = navBackStackEntry.arguments?.getString("id")
        SettingsScreenRoute(deepLinkData = argument)
    }
}