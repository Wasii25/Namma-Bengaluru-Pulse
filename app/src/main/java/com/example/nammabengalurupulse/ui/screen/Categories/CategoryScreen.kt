package com.example.nammabengalurupulse.ui.screen.Categories

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nammabengalurupulse.R
import com.example.nammabengalurupulse.ui.components.CategoryCard
import com.example.nammabengalurupulse.ui.components.topbar

@Composable
fun CoffeeCategoryScreen(
    @StringRes categoryTitle: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        topbar(
            title = categoryTitle
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 16.dp),
        ) {
            CategoryCard(
                image = R.drawable.third_wave,
                text = R.string.third_wave,
            )

            Spacer(modifier = Modifier.height(8.dp))

            CategoryCard(
                image = R.drawable.matteo,
                text = R.string.matteo,
            )

            Spacer(modifier = Modifier.height(8.dp))

            CategoryCard(
                image = R.drawable.hatti_kaapi,
                text = R.string.hatti_kaapi,
            )

            Spacer(modifier = Modifier.height(8.dp))

            CategoryCard(
                image = R.drawable.dyu,
                text = R.string.dyu,
            )

            Spacer(modifier = Modifier.height(8.dp))

            CategoryCard(
                image = R.drawable.blue_tokai,
                text = R.string.blue_tokai,
            )
        }
    }
}