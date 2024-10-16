package com.example.tarea4_android.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonText(modifier: Modifier = Modifier){
    var cambiarBoton by remember { mutableStateOf("Boton") }
    Column(modifier) {
        Button(onClick = { cambiarBoton = "Boton pulsado" },
        ) {
            Text(cambiarBoton)

        }
    }
}

@Composable
fun MyButtonColor(name: String, color: Color, modifier: Modifier = Modifier){
    var buttonText by remember { mutableStateOf(name) }
    var buttonColor by remember { mutableStateOf(Color.DarkGray) }
    var borderWidth by remember { mutableStateOf(1.dp) }
    var cornerRadius by remember { mutableStateOf(20.dp) }
    var textColor by remember { mutableStateOf(Color.White) }

    Column(modifier) {
        Button(
            onClick = {
                buttonText = "Botón pulsado"
                buttonColor = color
                borderWidth = 3.dp
                cornerRadius = 4.dp
                textColor = Color.Black
                Modifier.background(buttonColor)
            },

            colors = ButtonDefaults.buttonColors(buttonColor),
            shape = RoundedCornerShape(cornerRadius),
            border = BorderStroke(borderWidth, Color.Black)
        ) {
            Text(text = buttonText, color = textColor)
        }
    }
}