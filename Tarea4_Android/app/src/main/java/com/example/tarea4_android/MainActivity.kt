package com.example.tarea4_android

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarea4_android.ui.theme.Tarea4_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea4_AndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Login(
                        name = "Telefonica",
                        //color = Color.White,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//Ejecrcicio1
@Composable
fun MyText(name: String, modifier: Modifier = Modifier){
    Text(
        text = name,
        fontSize = 15.sp,
        color = Color.Magenta,
        modifier = modifier
    )
}

//Ejecrcicio2
@Composable
fun MyButtonText(modifier: Modifier = Modifier){
    var cambiarBoton by remember { mutableStateOf(false) }
    Column(modifier) {
        Button(onClick = { cambiarBoton = !cambiarBoton },
            ) {
            if (!cambiarBoton)
                Text("Boton")
            if (cambiarBoton) {
                Text("Boton pulsado")
            }
        }
    }
}

@Composable
fun MyButtonColor(name: String, backgroundColor: Color, modifier: Modifier = Modifier){
    var buttonText by remember { mutableStateOf(name) }
    var buttonColor by remember { mutableStateOf(Color.DarkGray) }
    var borderWidth by remember { mutableStateOf(1.dp) }
    var cornerRadius by remember { mutableStateOf(20.dp) }
    var textColor by remember { mutableStateOf(Color.White) }

    Column(modifier) {
        Button(
            onClick = {
                buttonText = "Botón pulsado"
                buttonColor = backgroundColor
                borderWidth = 3.dp
                cornerRadius = 4.dp
                textColor = Color.Black
            },

            //colors = Color.Black,
            shape = RoundedCornerShape(cornerRadius),
            border = BorderStroke(borderWidth, Color.Black)
        ) {
            Text(text = buttonText, color = textColor)
        }
    }
}

//Ejercicio 3
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea4_AndroidTheme {
        Greeting("Paco")
    }
}