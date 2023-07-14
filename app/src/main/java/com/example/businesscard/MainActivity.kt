package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun HeroBusinessCardWithImage(full_name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )  {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = modifier
                    .width(150.dp)
                    .padding(bottom = 0.dp)
            )
            Text(
                text = "android",
                modifier = modifier
                    .offset(y = -(50).dp)
            )
        }
        HeroBusinessCardWithText(full_name, title)
    }
}

@Composable
fun HeroBusinessCardWithText(full_name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = full_name,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
        )
        Text(
            text = title,
            modifier = modifier
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HeroBusinessCardWithImage("Lagarta Sadia", "The best android developer")
}