package com.example.lemonade.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.data.squeezeToaster
import kotlinx.coroutines.delay

// Toast event info with message
@Composable
fun ToastFadeIn(msg: Int) {
    Text(
        modifier = Modifier
            .padding(15.dp),
        textAlign = TextAlign.Center,
        text = stringResource(id = squeezeToaster[msg].toastMsg),
        color = Color.Gray,
        style = TextStyle(
            fontSize = 38.sp,
            fontWeight = FontWeight.ExtraBold,
        )
    )

}

// Set toaster visibility duration = milliseconds
@Composable
fun ToastInterval(isVisible: Boolean, toggleFun: ()-> Unit, duration: Long) {
    LaunchedEffect(isVisible) {
        if (isVisible) {
            delay(duration)
        }
        toggleFun()
    }
}