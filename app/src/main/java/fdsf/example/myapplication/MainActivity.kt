package fdsf.example.myapplication

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {

            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                color = Color(0xFF050B18)

            ) {

                    Column(modifier = Modifier.fillMaxSize()) {
                        dotabackground()
                        categories()
                        dota_description()
                        screenshotswiper()
                        raiting()
                        review()
                        install_button()
                    }
                }
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
                    categories()
                    dota_description()
                    screenshotswiper()
                    raiting()
                    install_button()
                    review()

                }
            }
        }

