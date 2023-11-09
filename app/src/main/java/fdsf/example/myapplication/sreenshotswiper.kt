package fdsf.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

//@Composable
//fun screenshotswiper() {
//    LazyRow {
//        item {
//            Image(
//                painter = painterResource(id = R.drawable.swipe1),
//                contentDescription = "swipe1",
//                contentScale = ContentScale.FillBounds,
//                modifier = Modifier
//                    .background(Color.Transparent)
//                    .height(120.dp)
//                    .padding(horizontal = 24.dp)
//            )
//        }
//        item {
//            Image(
//                painter = painterResource(id = R.drawable.swipe2),
//                contentDescription = "swipe2",
//                contentScale = ContentScale.FillBounds,
//                modifier = Modifier
//                    .background(Color.Transparent)
//                    .height(120.dp)
//                    .padding(horizontal = 24.dp)
//            )
//        }
//    }
//}



@Composable
fun screenshotswiper() {

        val imageList = listOf(
            R.drawable.swipe1,
            R.drawable.swipe2,
        )

        LazyRow {
            items(imageList) { image ->
                scroller(image)
            }
        }
    }

    @Composable
    fun scroller(image: Int) {
        Box(
            modifier = Modifier
                .height(120.dp)
                .padding(horizontal = 24.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = MaterialTheme.shapes.medium)
            )

            Image(
                painter = painterResource(id = R.drawable.icplay),
                contentDescription = "Play",
                modifier = Modifier
                    .size(50.dp)
                    .align(Alignment.Center)
            )
        }
    }
