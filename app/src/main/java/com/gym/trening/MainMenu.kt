package com.gym.trening

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    // Основной экран приложения
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 28.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            //.background(Color.Red)
            .fillMaxWidth(),
            verticalAlignment =  Alignment.Top,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Row(verticalAlignment = Alignment.Top) {
                Text(
                    text = "tренировка", fontSize = 30.sp,
                    modifier = Modifier.padding(end = 60.dp)
                )
                IconButton(onClick = { /* Действие для иконки 2 */ }) {
                    Icon(
                        imageVector = Icons.Filled.DateRange,
                        contentDescription = "Profile",
                        modifier = Modifier.size(40.dp)
                    )
                }
                IconButton(onClick = { /* Действие для иконки 1 */ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Home",
                        modifier = Modifier.size(40.dp)
                    )
                }

            }
        }
        // Чёрная линия
        Box(
            modifier = Modifier
                .height(2.dp)
                .width(330.dp)
                .background(Color.Black)
        )
    }
}
