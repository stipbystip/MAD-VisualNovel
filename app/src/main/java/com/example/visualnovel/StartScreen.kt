package com.example.visualnovel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Preview
@Composable
fun StartScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .paint(painter = painterResource(R.drawable.start), contentScale = ContentScale.Crop)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5F)
                    .padding(0.dp),
                contentAlignment = Alignment.BottomCenter,

                ) {
                Text(
                    text = "Моя визуальная новелла",
                    textAlign = TextAlign.Center,
                    fontSize = 45.sp,
                    color = Color.White,
                    modifier = Modifier
                            .background(colorResource(R.color.bgFirstColor))
                        .fillMaxWidth(),

                    )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(0.dp),
                contentAlignment = Alignment.Center,
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.bgSecondColor))

                ) {
                    Text(text = "Начать", fontSize = 23.sp)
                }
            }
        }
    }
}
