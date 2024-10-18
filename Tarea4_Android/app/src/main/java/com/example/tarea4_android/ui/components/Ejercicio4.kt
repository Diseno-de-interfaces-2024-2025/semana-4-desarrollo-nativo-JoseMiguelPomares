package com.example.tarea4_android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(modifier: Modifier = Modifier){
    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }
    var pais by remember { mutableStateOf("") }
    var actualizar by remember { mutableStateOf(false) }

    Box(modifier = modifier.fillMaxSize(), Alignment.TopCenter){
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .background(Color(0xff001427))
                    .height(80.dp), Alignment.Center){
                Text(text = "Screen", color = Color.White, fontSize = 30.sp)
            }
            Row(Modifier.horizontalScroll(rememberScrollState())
                    .background((Color(0xffeceaea)))) {
                repeat(15){
                    Button(onClick = {},
                        Modifier
                            .size(70.dp)
                            .padding(5.dp), colors = ButtonDefaults.buttonColors(Color(0xff56494e))) {
                        Text("")
                    }
                    Spacer(Modifier.height(20.dp))
                }
            }
            Row (Modifier
                    .height(240.dp)){
                Box(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(10.dp))){
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(Color(0xff489fb5)))
                }
                Box(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)){
                    Text("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.",
                        Modifier
                            .padding(10.dp)
                            .verticalScroll(rememberScrollState()))
                }
            }
            Row {
                Box(Modifier.fillMaxWidth(), Alignment.Center) {
                    Text("Formulario", fontSize = 40.sp)
                }
            }
            Box{

                Row (Modifier.padding(10.dp)) {
                    TextField(
                        value = nombre,
                        onValueChange = { nombre = it },
                        label = { Text("Nombre") },
                    )
                    if (actualizar)
                        Text(text = nombre, Modifier.weight(1f), textAlign = TextAlign.Center)
                }
            }
            Box {
                Row (Modifier.padding(10.dp)) {
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                    )
                    if (actualizar)
                        Text(text = email, Modifier.weight(1f), textAlign = TextAlign.Center)
                }
            }
            Box {
                Row (Modifier.padding(10.dp)) {
                    TextField(
                        value = direccion,
                        onValueChange = { direccion = it },
                        label = { Text("Direccion") },
                    )
                    if (actualizar)
                        Text(text = direccion, Modifier.weight(1f), textAlign = TextAlign.Center)
                }
            }
            Box {
                Row (Modifier.padding(10.dp)) {
                    TextField(
                        value = pais,
                        onValueChange = { pais = it },
                        label = { Text("Pais") },
                    )
                    if (actualizar)
                        Text(text = pais, Modifier.weight(1f), textAlign = TextAlign.Center)
                }
            }
            Box (Modifier.fillMaxWidth(), Alignment.Center) {
                Row (Modifier.padding(10.dp)) {
                    Button(onClick = {actualizar = !actualizar}) {
                        Text("Actualizar")
                    }
                }
            }
        }
    }
}