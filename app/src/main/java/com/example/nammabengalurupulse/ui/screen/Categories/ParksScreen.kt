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
fun ParksScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        topbar(title = R.string.parks_category)
        ParkList()
    }
}

@Composable
fun ParkList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp)
    ) {
        CategoryCard(image = R.drawable.cubbon_park, text = R.string.cubbon_park, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.lalbagh, text = R.string.lalbagh, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.jp_park, text = R.string.jp_park, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.bugle_rock, text = R.string.bugle_rock, onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        CategoryCard(image = R.drawable.bannerghatta, text = R.string.bannerghatta, onClick = { })
    }
}
