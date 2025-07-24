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
fun ShoppingScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        topbar(title = R.string.shopping_category)
        ShoppingList()
    }
}

@Composable
fun ShoppingList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(image = R.drawable.phoenix, text = R.string.phoenix, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.ub_city, text = R.string.ub_city, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.orion, text = R.string.orion, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.mantri, text = R.string.mantri, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.commercial_street, text = R.string.commercial_street, onClick = { })
    }
}
