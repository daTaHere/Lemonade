package com.example.lemonade.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.lemonade.components.ScreenImgComponent
import com.example.lemonade.components.ScreenSpacer
import com.example.lemonade.components.ScreenTextComponent
import com.example.lemonade.components.TextEnjoyComponent
// step 3 render lemonade completed acknowledgement
@Composable
fun GlassFilledScreen(
    screenIdx: Int,
    nextStep:()-> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextEnjoyComponent()
        ScreenImgComponent(index = screenIdx) { nextStep() }
        ScreenSpacer()
        ScreenTextComponent(index = screenIdx)
    }
}
