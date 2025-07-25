package com.example.nammabengalurupulse.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.data.Screen

@Composable
fun CategoryList(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(
            image = R.drawable.third_wave,
            text = R.string.coffee_shop_category,
            onClick = { navController.navigate(Screen.CoffeeShops.route) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.truffles,
            text = R.string.restaurant_category,
            onClick = { navController.navigate(Screen.Restaurants.route) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.cubbon_park,
            text = R.string.parks_category,
            onClick = { navController.navigate(Screen.Parks.route) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.bal_bhavan,
            text = R.string.kid_friendly_category,
            onClick = { navController.navigate(Screen.Kids.route) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        CategoryCard(
            image = R.drawable.mantri,
            text = R.string.shopping_category,
            onClick = { navController.navigate(Screen.Shopping.route) }
        )
    }
}