package com.example.nammabengalurupulse.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int
)

