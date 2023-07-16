package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(1f)
            .background(Color.DarkGray)
    ) {
        Column {
            HeroBusinessCardWithImage(
                stringResource(R.string.full_name),
                stringResource(R.string.title)
            )
            ContactInformationWithText(
                stringResource(R.string.phone_number),
                stringResource(R.string.github),
                stringResource(R.string.email)
            )
        }
    }
}

@Composable
fun HeroBusinessCardWithImage(full_name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(0.75f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = CenterHorizontally
        )  {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = modifier
                    .width(150.dp)
                    .padding(bottom = 0.dp)
            )
        }
        HeroBusinessCardWithText(full_name, title)
    }
}

@Composable
fun HeroBusinessCardWithText(full_name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = full_name,
            fontSize = 36.sp,
            modifier = modifier
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
            color = Color.White
        )
        Text(
            text = title,
            modifier = modifier
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
            color = Color(0xFF3DDC84)
        )
    }
}

@Composable
fun ContactInformationWithText(phone: String, github: String, email: String) {
    Column {
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .height(1.dp)
        )
        Row(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .padding(start = 50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.phone_call),
                contentDescription = "Phone icon",
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = phone,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .height(1.dp)
        )
        Row(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .padding(start = 50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.github),
                contentDescription = "Github icon",
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = github,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .height(1.dp)
        )
        Row(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .padding(start = 50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email icon",
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = email,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardApp()
}