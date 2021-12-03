package com.example.test.ui.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.round


@Composable
fun topbar(modifier :  Modifier= Modifier) {

    Box(modifier = modifier
        .fillMaxWidth()
        .height(56.dp)
        .background(Color.Black)
    ){
        Row(modifier = Modifier
            .height(25.dp)
            .width(120.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color.Yellow)) {

            Button(onClick = { },modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                ,colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                ) {
                Text(text = "Few",fontSize = 7.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prew_box () {

    topbar()

}