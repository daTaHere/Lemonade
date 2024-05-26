package com.example.lemonade.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lemonade.components.ScreenImgComponent
import com.example.lemonade.components.ScreenSpacer
import com.example.lemonade.components.ScreenTextComponent
import com.example.lemonade.data.dataList

// step 1 render pick lemon process
@Composable
fun LemonTreeScreen(
    screenIdx: Int,
    nextStep:()-> Unit,
    ) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        ScreenSpacer(90.dp)
        if( screenIdx > 0 && screenIdx <= dataList.size){

            ScreenImgComponent(index = screenIdx) { nextStep() }
            ScreenSpacer()
            ScreenTextComponent(index= screenIdx)
        }
    }
}


