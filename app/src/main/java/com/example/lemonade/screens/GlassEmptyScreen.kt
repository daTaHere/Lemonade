package com.example.lemonade.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lemonade.R
import com.example.lemonade.components.ButtonComponent
import com.example.lemonade.components.ScreenImgComponent
import com.example.lemonade.components.ScreenSpacer
import com.example.lemonade.components.ScreenTextComponent
// step 4 render empty glass and restart or end process
@Composable
fun GlassEmptyScreen(
    screenIdx: Int,
    nextStep:()-> Unit,
    exit:()-> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            ButtonComponent(btnText = R.string.done_text_btn, color = Color(0xFFFFC0CB)) { exit() }
        }
        ScreenImgComponent(index = screenIdx) { nextStep() }
        ScreenSpacer()
        ScreenTextComponent(index = screenIdx)
    }
}