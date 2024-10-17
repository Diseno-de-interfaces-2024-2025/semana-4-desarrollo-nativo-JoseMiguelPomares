package com.example.tarea4_android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(modifier: Modifier = Modifier){

    Box(modifier = modifier.fillMaxSize(), Alignment.TopCenter){
        Column {
            Box(Modifier.fillMaxWidth()
                .background(Color.Black)
                .height(60.dp), Alignment.Center){
                Text(text = "Screen", color = Color.White, fontSize = 20.sp)
            }
            Row(Modifier.horizontalScroll(rememberScrollState()).background((Color.LightGray))) {
                repeat(15){
                    Button(onClick = {}, Modifier.size(50.dp).padding(5.dp), colors = ButtonDefaults.buttonColors(Color.Gray)) {
                        Text("")
                    }
                    Spacer(Modifier.height(20.dp))
                }
            }
            Box(Modifier.fillMaxSize().weight(1f))
        }
    }
}