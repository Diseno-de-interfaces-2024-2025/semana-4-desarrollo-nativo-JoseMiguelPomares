package com.example.tarea4_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.tarea4_android.ui.theme.Tarea4_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea4_AndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyButtonText(
                        name = "Android",
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
fun MyButtonText(name: String, modifier: Modifier = Modifier){
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