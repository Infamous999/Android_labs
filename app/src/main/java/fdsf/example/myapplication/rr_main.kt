package fdsf.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp







@Composable
fun raiting() {
    Text(
        modifier = Modifier
            .padding (horizontal = 25.dp, vertical = 20.dp),
        color = Color.White,
        text = "Review & Ratings",
        style = TextStyle(
            fontFamily = FontFamily(Font(R.font.skmodernist)),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
        )
    )
    Row() {
        Text (
            modifier = Modifier
                .padding (horizontal = 25.dp),
            color = Color.White,
            text = "4.9",
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.skmodernist)),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Column() {
            Image(
                painter = painterResource(id = R.drawable.rrstars),
                contentDescription = "srrr",
                modifier = Modifier
                    .width(76.dp)
                    .padding(vertical = 15.dp),
                contentScale = ContentScale.Crop
            )
            Text (
                text = "70M Reviews",
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.skmodernist)),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.ExtraLight,
                    color = Color(0xFFA8ADB7),
                    letterSpacing = 0.5.sp
                )
            )
        }
    }
}