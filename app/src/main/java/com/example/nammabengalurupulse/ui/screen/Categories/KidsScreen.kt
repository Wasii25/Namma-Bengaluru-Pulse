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
fun KidsScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        topbar(title = R.string.kid_friendly_category)
        KidsList()
    }
}

@Composable
fun KidsList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(image = R.drawable.bal_bhavan, text = R.string.bal_bhavan, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.snow_city, text = R.string.snow_city, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.film_city, text = R.string.film_city, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.fun_world, text = R.string.fun_world, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.science_museum, text = R.string.science_museum, onClick = { })
    }
}
