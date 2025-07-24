package com.example.nammabengalurupulse.data

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object CoffeeShops : Screen("coffee_shops")
    object Restaurants : Screen("restaurants")
    object Parks : Screen("parks")
    object Kids : Screen("kids")
    object Shopping : Screen("shopping")
}