package com.example.nammabengalurupulse.data

import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.model.Place

object SampleData {
    val coffeeShops = listOf(
        Place(R.string.third_wave, R.string.third_wave_desc, R.drawable.third_wave),
        Place(R.string.matteo, R.string.matteo_desc, R.drawable.matteo),
        Place(R.string.hatti_kaapi, R.string.hatti_kaapi_desc, R.drawable.hatti_kaapi),
        Place(R.string.dyu, R.string.dyu_desc, R.drawable.dyu),
        Place(R.string.blue_tokai, R.string.blue_tokai_desc, R.drawable.blue_tokai)
    )

    val restaurants = listOf(
        Place(R.string.toit, R.string.toit_desc, R.drawable.toit),
        Place(R.string.mtr, R.string.mtr_desc, R.drawable.mtr),
        Place(R.string.truffles, R.string.truffles_desc, R.drawable.truffles),
        Place(R.string.koshys, R.string.koshys_desc, R.drawable.koshys),
        Place(R.string.black_rabbit, R.string.black_rabbit_desc, R.drawable.black_rabbit)
    )

    val parks = listOf(
        Place(R.string.cubbon_park, R.string.cubbon_park_desc, R.drawable.cubbon_park),
        Place(R.string.lalbagh, R.string.lalbagh_desc, R.drawable.lalbagh),
        Place(R.string.jp_park, R.string.jp_park_desc, R.drawable.jp_park),
        Place(R.string.bugle_rock, R.string.bugle_rock_desc, R.drawable.bugle_rock),
        Place(R.string.bannerghatta, R.string.bannerghatta_desc, R.drawable.bannerghatta)
    )

    val kidFriendlyPlaces = listOf(
        Place(R.string.bal_bhavan, R.string.bal_bhavan_desc, R.drawable.bal_bhavan),
        Place(R.string.snow_city, R.string.snow_city_desc, R.drawable.snow_city),
        Place(R.string.film_city, R.string.film_city_desc, R.drawable.film_city),
        Place(R.string.fun_world, R.string.fun_world_desc, R.drawable.fun_world),
        Place(R.string.science_museum, R.string.science_museum_desc, R.drawable.science_museum)
    )

    val shoppingCenters = listOf(
        Place(R.string.phoenix, R.string.phoenix_desc, R.drawable.phoenix),
        Place(R.string.ub_city, R.string.ub_city_desc, R.drawable.ub_city),
        Place(R.string.orion, R.string.orion_desc, R.drawable.orion),
        Place(R.string.mantri, R.string.mantri_desc, R.drawable.mantri),
        Place(R.string.commercial_street, R.string.commercial_street_desc, R.drawable.commercial_street)
    )
}
