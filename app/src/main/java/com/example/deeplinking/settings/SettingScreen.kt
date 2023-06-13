package com.example.deeplinking.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.deeplinking.R

@Composable
internal fun SettingsScreenRoute(
    modifier: Modifier = Modifier,
    deepLinkData: String? = null
) {
    SettingsScreen(modifier, deepLinkData)
}

@Composable
fun SettingsScreen(modifier: Modifier = Modifier, deepLinkData: String? = null) {
    Column(
        modifier = modifier
            .fillMaxSize().background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "This is Settings Screen",
            modifier = Modifier.testTag("title"),
            color = Color.Blue
        )
        Text(
            text = "$deepLinkData",
            modifier = Modifier.testTag("deeplinkArgument"),
            color = Color.Blue
        )
        Icon(painter = painterResource(
            id = R.drawable.baseline_settings_24),
            contentDescription =null ,
            tint = Color.Gray,
            modifier = Modifier.size(100.dp)
        )

    }
}