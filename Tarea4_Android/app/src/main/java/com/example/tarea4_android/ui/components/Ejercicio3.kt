package com.example.tarea4_android.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Login(name: String, modifier: Modifier = Modifier){
    var usuario by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }
    var botonPulsado by remember { mutableStateOf(false) }
    Column(modifier) {
        TextField(
            value = usuario,
            onValueChange = { usuario = it },
            label = { Text("Usuario") }
        )
        Spacer(Modifier.height(10.dp))
        TextField(
            value = contraseña,
            onValueChange = { contraseña = it },
            label = { Text("Contraseña") },
        )
        Spacer(Modifier.height(10.dp))
        Button(onClick = { botonPulsado = !botonPulsado },
        ) {
            Text("Acceder")
        }
        if (usuario == "admin" && contraseña == "1234" && botonPulsado)
            Text("Usuario Correcto", color = Color.Green)
        else if (usuario != "admin" && contraseña != "1234" && botonPulsado)
            Text("Usuario Incorrecto", color = Color.Red)
    }
}