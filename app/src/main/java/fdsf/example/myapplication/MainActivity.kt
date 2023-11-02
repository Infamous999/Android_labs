package fdsf.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                Surface(color = Color.Black, modifier = Modifier.fillMaxSize()) {
                    Box(Modifier.fillMaxWidth()) {
                        dotabackground()
                        background()
                        dota_description()
                        screenshotswiper()
                        InstallButton()
                    }
                }
            }
        }
    }




        @Composable
        fun dotabackground() {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.dota_main),
                    contentDescription = "header_photo",
                    modifier = Modifier
                        .width(628.dp)
                        .height(368.07339.dp),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dota_loggo),
                        contentDescription = "logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(0.dp)
                            .width(88.dp)
                            .height(95.dp)
                            .offset(x = 10.dp, y = 230.dp),
                    )
                }
            }
        }


        @Composable
        fun dota_description() {
            Text(
                modifier = Modifier
                    .width(327.dp)
                    .height(76.dp),
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontFamily = FontFamily(Font(R.font.skmodernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xB2EEF2FB),
                )
            )
        }


        @Composable
        fun background() {
            Image(
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFF000000))
                    .padding(1.dp)
                    .width(375.dp)
                    .height(930.dp)
                    .background(color = Color(0xFF050B18)),
                painter = painterResource(id = R.drawable.trynu),
                contentDescription = "image description",
                contentScale = ContentScale.None
            )
        }


        @Composable
        fun screenshotswiper() {
            LazyRow {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.swipe1),
                        contentDescription = "swipe1",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .background(Color.Transparent)
                            .height(120.dp)
                            .padding(horizontal = 24.dp)
                    )
                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.swipe2),
                        contentDescription = "swipe2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .background(Color.Transparent)
                            .height(120.dp)
                            .padding(horizontal = 24.dp)
                    )
                }
            }
        }


@Composable
fun InstallButton() {
    var isDownloadStarted by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .width(327.dp)
            .height(64.dp)
            .background(
                color = Color(0xFFF4D144),
                shape = RoundedCornerShape(size = 12.dp)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow, shape = RoundedCornerShape(8.dp))
                .clickable {
                    // Toggle the download state when clicked
                    isDownloadStarted = !isDownloadStarted
                }
                .padding(10.dp) // Padding for centering
        ) {
            Text(
                text = if (isDownloadStarted) "Download Started" else "Install",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}



        @Preview(showBackground = true)
        @Composable
        fun ScreenPreview() {

                Surface(
                    color = Color.Black,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        dotabackground()
                        background()
                        dota_description()
                        screenshotswiper()
                        InstallButton()
                    }
                }
            }

