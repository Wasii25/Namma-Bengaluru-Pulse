package com.example.nammabengalurupulse.data

sealed class Coffee (val route: String) {

        object ThirdWave : Screen("third_wave")
        object Matteo : Screen("matteo")
        object HattiKaapi : Screen("hattiKaapi")
        object Dyu : Screen("dyu")
        object BlueTokai : Screen("blue_tokai")

}