package com.example.deeplinking.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.deeplinking.R

@Composable
internal fun HomeScreenRoute(
    modifier: Modifier = Modifier,
    deepLinkData: String? = null
) {
    HomeScreen(modifier, deepLinkData)
}



@Composable
fun HomeScreen(modifier: Modifier = Modifier, deepLinkData: String? = null) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "This is Home Screen $deepLinkData", color = Color.Black)
        Spacer(modifier = Modifier.height(20.dp))
        Icon(painter = painterResource(
            id =R.drawable.baseline_home_24),
            contentDescription =null ,
            tint = Color.Gray,
            modifier = Modifier.size(100.dp)
        )
    }
}