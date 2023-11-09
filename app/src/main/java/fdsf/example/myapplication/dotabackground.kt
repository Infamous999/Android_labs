package fdsf.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
    fun dotabackground() {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(327.dp)
            .background(color = Color(0xFFC4C4C4))
        ) {
            Image(
                painter = painterResource(id = R.drawable.pepeepep),
                contentDescription = "header_photo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(354.dp),
                contentScale = ContentScale.FillBounds
            )
            Box(
                modifier = Modifier
                    .padding(vertical = 45.dp, horizontal = 15.dp)
            ) {

                   Image(
                       painter = painterResource(id = R.drawable.dota_loggo),
                       contentDescription = "logo",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .padding(0.dp)
                           .width(115.dp)
                           .height(95.dp)
                           .offset(x = 10.dp, y = 260.dp),
                   )
            }
        }

                   Column( modifier = Modifier
                       .padding(top = 35.dp, bottom = 0.dp, start = 125.dp, end = 125.dp )
                       .offset(y = -35.dp) ) {
                       Text(
                           text = "DoTA 2",
                           style = TextStyle(
                               fontSize = 20.sp,
                               lineHeight = 26.sp,
                               fontFamily = FontFamily(Font(R.font.skmodernist)),
                               fontWeight = FontWeight(700),
                               color = Color(0xFFFFFFFF),
                               letterSpacing = 0.5.sp,
                           )
                       )
                       Row(modifier = Modifier.padding(vertical = 5.dp)) {
                           Image(
                               painter = painterResource(id = R.drawable.stars),
                               contentDescription = "starsss",
                               contentScale = ContentScale.Crop,
                               modifier = Modifier.width(76.dp)
                           )

                           Text( modifier = Modifier
                               .padding(horizontal = 5.dp)
                               .width(26.dp)
                               .height(14.dp),
                               text = "70M",
                               style = TextStyle(
                                   fontSize = 12.sp,
                                   fontFamily = FontFamily(Font(R.font.skmodernist)),
                                   fontWeight = FontWeight(400),
                                   color = Color(0xFF45454D),
                                   letterSpacing = 0.5.sp,
                               )
                           )
                       }
                   }



               }



