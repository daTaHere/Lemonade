package com.example.lemonade.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lemonade.R
import com.example.lemonade.components.ButtonComponent
import com.example.lemonade.components.ScreenSpacer
import com.example.lemonade.components.WelcomeImgComponent

// render welcome screen
@Composable
fun WelcomeScreen( screenIdx: Int, nextStep:()-> Unit ) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if( screenIdx == 0 ) {
            WelcomeImgComponent(index = screenIdx)
        }
        ScreenSpacer(10.dp)
        ButtonComponent(btnText = R.string.begin_text_btn, Color.Yellow){nextStep()}
    }
}



