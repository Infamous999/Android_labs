package fdsf.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun review(){

        Spacer(modifier = Modifier
            .height(20.dp))
        Row (modifier = Modifier
            .padding (horizontal = 25.dp)) {
            Image(
                painter = painterResource(id = R.drawable.viewer1),
                contentDescription = "Profile photo",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = stringResource(id = R.string.comment_author),
                    color = Color.White,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.skmodernist)),
                        fontSize = 16.sp,
                        fontWeight =  FontWeight.Normal,
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(id = R.string.comment_date),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.skmodernist)),
                        fontSize = 12.sp,
                        fontWeight =  FontWeight.Normal,
                        color = Color(0x66FFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))

            }
        }
        Text(
            modifier = Modifier
                .padding(horizontal = 25.dp),
            text = stringResource(id = R.string.comment_text),
            color = Color.White,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.skmodernist)),
                fontSize = 12.sp,
                fontWeight =  FontWeight.Normal,
                color = Color(0xFFA8ADB7),
            )
        )
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
        )
        Row (modifier = Modifier
            .padding (horizontal = 25.dp)) {
            Image(
                painter = painterResource(id = R.drawable.viewer2),
                contentDescription = "Profile photo",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = stringResource(id = R.string.comment_author2),
                    color = Color.White,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.skmodernist)),
                        fontSize = 16.sp,
                        fontWeight =  FontWeight.Normal,
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(id = R.string.comment_date),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.skmodernist)),
                        fontSize = 12.sp,
                        fontWeight =  FontWeight.Normal,
                        color = Color(0x66FFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))

            }
        }
        Text(
            modifier = Modifier
                .padding(horizontal = 25.dp),
            text = stringResource(id = R.string.comment_text),
            color = Color.White,
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.skmodernist)),
                fontSize = 12.sp,
                fontWeight =  FontWeight.Normal,
                color = Color(0xFFA8ADB7),
            )
        )

}