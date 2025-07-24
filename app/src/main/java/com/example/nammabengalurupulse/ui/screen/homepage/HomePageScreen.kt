package com.example.nammabengalurupulse.ui.screen.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.nammabengalurupulse.ui.components.topbar
import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.data.Screen
import com.example.nammabengalurupulse.ui.components.CategoryCard
import com.example.nammabengalurupulse.ui.components.CategoryList
import androidx.navigation.compose.composable
import com.example.nammabengalurupulse.ui.screen.Categories.CoffeeShopsScreen
import com.example.nammabengalurupulse.ui.screen.Categories.KidsScreen
import com.example.nammabengalurupulse.ui.screen.Categories.ParksScreen
import com.example.nammabengalurupulse.ui.screen.Categories.RestaurantsScreen
import com.example.nammabengalurupulse.ui.screen.Categories.ShoppingScreen

@Composable
fun HomePageScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.background)
    ) {
        topbar(
            title = R.string.app_name
        )
        Intro()
        CategoryList(
            navController = navController,
            modifier = modifier
        )
    }

}

@Composable
fun Intro(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.bengaluru),
            contentDescription = stringResource(R.string.City_image_desc),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(16.dp)
                .size(300.dp)
                .shadow(8.dp, RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = stringResource(R.string.city_intro),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(8.dp)
        )
    }
}




@Composable
fun CategoryNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomePageScreen(navController = navController)
        }

        composable(Screen.CoffeeShops.route) {
            CoffeeShopsScreen()
        }

        composable(Screen.Restaurants.route) {
            RestaurantsScreen()
        }

        composable(Screen.Parks.route) {
            ParksScreen()
        }

        composable(Screen.Kids.route) {
            KidsScreen()
        }

        composable(Screen.Shopping.route) {
            ShoppingScreen()
        }
    }
}
