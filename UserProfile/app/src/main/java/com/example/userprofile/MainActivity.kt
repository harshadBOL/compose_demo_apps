package com.example.userprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.userprofile.ui.theme.UserProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileCard()
                }
            }
        }
    }
}

@Composable
fun ProfileCard() {
    Surface(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Card(
            modifier = Modifier.width(200.dp).height(390.dp).padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = Color.White,
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ProfileImageFunction()
                Divider(thickness = 4.dp)
                Column(modifier = Modifier.padding(5.dp)) {
                    Text(
                        text = "Harshad Pawar",
                        style = MaterialTheme.typography.h4,
                        color = MaterialTheme.colors.error
                    )
                }
            }
        }
    }
}

@Composable
private fun ProfileImageFunction() {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp, Color.LightGray),
        elevation = 4.dp,
        color = Color.White
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_images),
            contentDescription = "user Profile image",
            modifier = Modifier.size(135.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UserProfileTheme {
        ProfileCard()
    }
}
