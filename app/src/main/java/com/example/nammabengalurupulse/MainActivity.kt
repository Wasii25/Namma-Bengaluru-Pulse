package com.example.nammabengalurupulse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.nammabengalurupulse.ui.screen.homepage.CategoryNavHost
import com.example.nammabengalurupulse.ui.screen.homepage.HomePageScreen
import com.example.nammabengalurupulse.ui.theme.NammaBengaluruPulseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NammaBengaluruPulseTheme {
                Surface {
                    CategoryNavHost()
                }
            }
        }
    }
}
