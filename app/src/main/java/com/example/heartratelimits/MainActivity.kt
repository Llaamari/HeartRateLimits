
package com.example.heartratelimits

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.heartratelimits.ui.theme.HeartRateLimitsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            HeartRateLimitsTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    HeartRateLimits(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HeartRateLimits(modifier: Modifier = Modifier) {
    Text(
        text = "Your heart rate limits are",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HeartRateLimitsPreview() {
    HeartRateLimitsTheme {
        HeartRateLimits()
    }
}
