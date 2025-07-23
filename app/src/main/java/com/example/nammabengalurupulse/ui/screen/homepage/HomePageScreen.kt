package com.example.nammabengalurupulse.ui.screen.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.nammabengalurupulse.ui.components.topbar
import com.example.nammabengalurupulse.R

@Composable
fun HomePageScreen(modifier: Modifier = Modifier) {
    Intro(modifier = modifier.fillMaxSize())

}

@Composable
fun Intro(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        topbar(
            title = R.string.app_name
        )


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

