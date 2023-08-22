package com.example.visualnovel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualnovel.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen() {
    val message = remember{mutableStateOf("")}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .paint(painter = painterResource(R.drawable.start), contentScale = ContentScale.Crop)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.with_kiryusha),
            contentDescription = "image",
            modifier = Modifier.fillMaxSize(),
            alignment = Alignment.CenterStart
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6F)
                    .padding(0.dp),
                contentAlignment = Alignment.BottomCenter,

                ) {
                Text(
                    text = "Привет! меня зовут Кирюша. А тебя?",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .background(colorResource(R.color.bgSecondColor))
                        .fillMaxWidth()
                        .padding(2.dp, 5.dp),
                )
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
                ) {
                TextField(
                    value = message.value,
                    onValueChange = {
                            newText -> message.value = newText
                                    },
                    modifier = Modifier.fillMaxWidth().padding(2.dp, 5.dp),
                    singleLine = true,
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.bgSecondColor))

                ) {
                    Text(text = "Потвердить", fontSize = 23.sp)
                }
            }
        }
    }
}
