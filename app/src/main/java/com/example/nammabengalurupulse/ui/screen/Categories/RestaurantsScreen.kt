package com.example.nammabengalurupulse.ui.screen.Categories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nammabengalurupulse.ui.components.topbar
import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.ui.components.CategoryCard

@Composable
fun RestaurantsScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        topbar(title = R.string.restaurant_category)
        RestaurantList()
    }
}

@Composable
fun RestaurantList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(image = R.drawable.toit, text = R.string.toit, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.mtr, text = R.string.mtr, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.truffles, text = R.string.truffles, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.koshys, text = R.string.koshys, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.black_rabbit, text = R.string.black_rabbit, onClick = { })
    }
}
