package fdsf.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun categories(){
    Row(modifier = Modifier
        .padding(vertical = 0.dp, horizontal = 21.dp)) {

        Box(modifier = Modifier.padding(horizontal = 10.dp)

            .width(53.dp)
            .height(22.dp)
            .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
            )
        {
            Text(
                text = "MOBA",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.skmodernist)),
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF44A9F4),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight()
            )
        }
        
        Box(modifier = Modifier
            .padding(horizontal = 10.dp)
            .width(93.dp)
            .height(22.dp)
            .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))){
            Text(
                text = "MULTIPLAYER",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.skmodernist)),
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF41A0E7),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight()
            )
        }

        Box(modifier = Modifier
            .padding(horizontal = 8.dp)
            .width(73.dp)
            .height(22.dp)
            .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
        )
        {
            Text(
                text = "STRATEGY",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.skmodernist)),
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF41A0E7),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight()


            )
        }
    }
}