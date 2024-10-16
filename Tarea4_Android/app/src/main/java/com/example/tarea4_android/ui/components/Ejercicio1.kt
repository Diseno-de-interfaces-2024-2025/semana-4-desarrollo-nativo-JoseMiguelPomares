package com.example.tarea4_android.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MyText(name: String, modifier: Modifier = Modifier){
    Text(
        text = name,
        fontSize = 15.sp,
        color = Color.Magenta,
        modifier = modifier
    )
}