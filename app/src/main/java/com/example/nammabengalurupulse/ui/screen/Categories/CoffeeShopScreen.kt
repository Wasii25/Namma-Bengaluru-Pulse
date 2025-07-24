package com.example.nammabengalurupulse.ui.screen.Categories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nammabengalurupulse.ui.components.topbar
import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.data.Screen
import com.example.nammabengalurupulse.ui.components.CategoryCard

@Composable
fun CoffeeShopsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        topbar(
            title = R.string.coffee_shop_category
        )

        CoffeeList()

    }
}


@Composable
fun CoffeeList(
//    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(
            image = R.drawable.third_wave,
            text = R.string.third_wave,
            onClick = {  }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.matteo,
            text = R.string.matteo,
            onClick = { }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.hatti_kaapi,
            text = R.string.hatti_kaapi,
            onClick = { }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.dyu,
            text = R.string.dyu,
            onClick = {  }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.blue_tokai,
            text = R.string.blue_tokai,
            onClick = {  }
        )
    }
}