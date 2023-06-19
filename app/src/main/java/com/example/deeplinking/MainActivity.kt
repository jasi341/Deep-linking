package com.example.deeplinking

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.deeplinking.home.homeNavigationRoute
import com.example.deeplinking.home.homeScreen
import com.example.deeplinking.settings.settingsScreen
import com.example.deeplinking.ui.theme.DeepLinkingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeepLinkingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =Color.White
                ) {
                    MainApp()
                }
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
    }
}



@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = homeNavigationRoute
) {

    NavHost(
        modifier = modifier.background(Color.White),
        navController = navController,
        startDestination = startDestination,
    ) {
        homeScreen()
        settingsScreen()
    }
}






@Composable
fun MainApp() {
    val navController = rememberNavController()
    MainNavHost(navController = navController)


}

