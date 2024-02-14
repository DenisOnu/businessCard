package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Card(
        //backgroundColor = Color(0xFFA8D8B9), // Use the exact color from your card
        colors = CardDefaults.cardColors(containerColor = Color(0xFFA8D8B9)),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .padding(
//                    horizontal = 16.dp,
//                    vertical = 80.dp
                    top = 200.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(

                modifier = Modifier
                    .size(100.dp) // Set the size of the box
                    .background(
                        color = Color.Black, // Set the box color to dark
                    ),
                contentAlignment = Alignment.Center // This centers the icon inside the box
            ) {
                Image( // Replace with a vector asset or an image as per your card
                    painter = painterResource(id = R.drawable.android_icon),
                    contentDescription = "Android Logo",
                    modifier = Modifier
                        .size(100.dp) // Adjust the size as necessary
                        .padding(bottom = 8.dp) // Adjust the padding as necessary
                )
            }
            Text(
                "Denis Onu",
                style = MaterialTheme.typography.headlineLarge)
            Text(
                "Android Developer Extraordinaire",
                style = MaterialTheme.typography.bodyLarge.copy(color= Color.Blue)
            )
            Spacer(modifier = Modifier.height(150.dp))
            Row {
                Icon(Icons.Default.Phone,
                    contentDescription = "Phone",
                    modifier = Modifier.size(24.dp),
                )
                Text(
                    "+11 (123) 444 555 666",
                    style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 14.sp // Adjust the font size as necessary
                    ),
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Icon(
                    Icons.Filled.Share, contentDescription = "Twitter Handle")
                Text("@AndroidDev")
            }
            Row {
                Icon(Icons.Default.Email, contentDescription = "Email")
                Text("jen.doe@android.com")
            }
        }
    }
}
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
//        Greeting("Android")
        BusinessCard()
    }
}