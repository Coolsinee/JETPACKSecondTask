package com.example.jetpacksecondtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Modificators()
            //Colooors()
            //Sizeees()
            //Otstypi()
            //Scrollers()
            //Clickan()
            //Clickandypola()


        }
    }
}

@Composable
public fun Modificators(){
    Text(
        "Hello METANIT.COM",
        fontSize=22.sp,
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
            .padding(30.dp)
    )
}

@Composable
public fun Colooors() {
    val myColor: Color = Color(red = 0xF1, green = 0xAA, blue = 0x55, alpha = 0xFF)
    Text(
        "Hello METANIT.COM",
        fontSize=22.sp,
        modifier = Modifier
            .background(myColor)
            .padding(30.dp)
    )
}

@Composable
public fun Sizeees() {
    Text(
        "Hello METANIT.COM",
        fontSize=22.sp,
        modifier = Modifier
            .background(color = Color.Yellow)
            .fillMaxSize(0.5f)
    )
}

@Composable
public fun Otstypi() {
    Text(
        "Hello METANIT.COM",
        fontSize=22.sp,
        modifier = Modifier
            .size(width = 300.dp, height = 200.dp)
            .background(color = Color.Yellow)
            .offset(x = 30.dp, y = 50.dp)
//        "Hello METANIT.COM",
//        fontSize=22.sp,
//        modifier = Modifier.size(width=300.dp, height=200.dp)
//            .offset(x=30.dp, y=50.dp)
//            .background(color= Color.Yellow)
    )
}

@Composable
public fun Scrollers() {
    Text(
        "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "...............",
        fontSize=22.sp,
        modifier = Modifier
            .background(color = Color.Yellow)
            .verticalScroll(rememberScrollState())
    )
//    Text(
//        "What is Lorem Ipsum?\n" +
//                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
//                "\n" +
//                "...............",
//        fontSize=22.sp,
//        modifier = Modifier.background(color= Color.Yellow)
//            .verticalScroll(rememberScrollState())
//            .horizontalScroll(rememberScrollState())
//    )
}

@Composable
public fun Clickan() {
    val count = remember{mutableStateOf(0)}

    Text("Clicks: ${count.value}",
        fontSize = 28.sp,
        modifier = Modifier.clickable( onClick = { count.value += 1 })
    )
}

@Composable
public fun Clickandypola() {
    val count = remember{mutableStateOf(0)}

    Text("Clicks: ${count.value}",
        fontSize = 28.sp,
        modifier = Modifier.clickable( onClick = { count.value += 1 })
    )
}
