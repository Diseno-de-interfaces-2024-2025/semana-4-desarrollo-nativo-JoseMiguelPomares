package com.example.tarea4_android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Login(name: String, modifier: Modifier = Modifier){
    var usuario by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }
    var botonPulsado by remember { mutableStateOf(false) }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column(modifier.fillMaxWidth()) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                TextField(
                    value = usuario,
                    onValueChange = { usuario = it },
                    label = { Text("Usuario") }
                )
            }
            Spacer(Modifier.height(20.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                TextField(
                    value = contraseña,
                    onValueChange = { contraseña = it },
                    label = { Text("Contraseña") },
                )
            }
            Spacer(Modifier.height(20.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                if (usuario == "admin" && contraseña == "1234" && botonPulsado)
                    Text("Usuario Correcto", color = Color.Green)
                else if (usuario != "admin" && contraseña != "1234" && botonPulsado)
                    Text("Usuario Incorrecto", color = Color.Red)
            }
            Spacer(Modifier.height(20.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Button(onClick = { botonPulsado = !botonPulsado }
                ) {
                    Text("Acceder")
                }
            }
        }
    }
}