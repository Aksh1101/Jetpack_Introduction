package com.example.jetpack_introduction

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(modifier = Modifier.padding(top = 50.dp)) {
//                Text(text = "JETPACK", color = Color.Red, fontSize = 40.sp,
//                    fontFamily = FontFamily.Cursive, fontStyle = FontStyle.Italic,
//                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.background(Color.Cyan)
//                        .fillMaxWidth())
//                Text(text = "COMPOSE", color = Color.Blue, fontSize = 40.sp,
//                    fontFamily = FontFamily.Cursive, fontStyle = FontStyle.Italic,
//                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.background(Color.Green)
//                        .fillMaxWidth())
//                ShowArray()
//            }
//            Layout()
//            Lazylayout()
//            Boxlayout()
//            Cardlayout()
              TextfieldLayout()

        }
    }
}

//@Composable
//fun ShowArray(){
//    val arr = arrayOf("A", "N","D","R","O","I","D")
//    for (name in arr)
//        Text(text = name, color = Color.Blue, fontSize = 40.sp,
//            fontFamily = FontFamily.SansSerif, fontStyle = FontStyle.Normal,
//            fontWeight = FontWeight.Bold,
//            textAlign = TextAlign.Center,
//            modifier = Modifier.background(Color.LightGray)
//                .fillMaxWidth())
//}

//@Composable
//fun Layout(){
//    Column(modifier = Modifier.fillMaxWidth()
//        .fillMaxHeight()
//        .background(Color.Magenta)
//        .verticalScroll(rememberScrollState()),
//        horizontalAlignment = Alignment.CenterHorizontally){
//        for (i in 1..4)
//            Text(text = "$i. Android Studio", fontSize = 28.sp)
//    }
//}

//@Composable
//fun Boxlayout(){
//    var context = LocalContext.current
//    Box(modifier = Modifier.fillMaxSize().background(Color.Yellow),
//        contentAlignment = Alignment.Center){
//        Text(text = "Kotlin Multiplatform", color = Color.Blue, fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.TopCenter))
//        Text(text = "Compose Multiplatform", color =Color.Red, fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.Center))
//        Button(onClick = {
//            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()},
//            modifier = Modifier.align(Alignment.BottomCenter)
//                .size(130.dp))
//        {
//            Text("Push Me")
//        }
//    }
//}

//@Composable
//fun Cardlayout() {
//    Card(
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxWidth().height(800.dp),
//            elevation = CardDefaults.cardElevation(100.dp)
//    ) {
//        Column(modifier = Modifier.fillMaxSize().background(Color.Green)) {
//            Image(
//                painter = painterResource(id = R.drawable.logo), null,
//                modifier = Modifier.padding(8.dp).size(500.dp)
//                    .clip(RoundedCornerShape(CornerSize(1000.dp)))
//            )
//            Text(
//                text = "Logo", fontSize = 50.sp,
//                modifier = Modifier
//                    .padding(10.dp)
//                    .align(Alignment.CenterHorizontally)
//            )
//        }
//
//    }
//
//
//}

@Composable
fun TextfieldLayout(){
    var valueOfField by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()){
        TextField(value =valueOfField, onValueChange = {
            valueOfField= it
        }, label = {Text(text = "Name")},
            placeholder = { Text(text = "Enter your name")},
            leadingIcon = { Icon(Icons.Default.Person, "") },
            trailingIcon = { Icon(Icons.Default.Info, "") })
    }
}


