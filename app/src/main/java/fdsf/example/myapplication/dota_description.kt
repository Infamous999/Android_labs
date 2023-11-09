package fdsf.example.myapplication

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun dota_description() {
    Text(
        modifier = Modifier

            .padding(horizontal = 24.dp, vertical = 15.dp),

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
