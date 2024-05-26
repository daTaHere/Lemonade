package com.example.lemonade.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lemonade.components.LemonSqueezeToaster
import com.example.lemonade.components.ScreenImgComponent
import com.example.lemonade.components.ScreenSpacer
import com.example.lemonade.components.ScreenTextComponent
import kotlin.random.Random

// step 2 render lemon squeeze process
@Composable
fun LemonSqueezeScreen(
    screenIdx: Int,
    nextStep:()-> Unit
) {
    // generate random total squeeze to complete
    var squeezeTimes by remember {
        mutableIntStateOf(Random.nextInt(2,5))
    }

    // track how many squeeze occurred
    var squeezeTotal by remember {
        mutableIntStateOf(0)
    }

    // function to increment squeeze
    val tabCount: ()-> Unit = {
        when(squeezeTotal) {
            squeezeTimes - 1 -> nextStep()
            else -> squeezeTotal++
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ) {
            displaySqueezeToaster(currentSqueezeCnt = squeezeTotal)
        }

        ScreenImgComponent(index = screenIdx) {
                tabCount()
        }
        ScreenSpacer()
        ScreenTextComponent(index = screenIdx)
    }
}

// render current toaster
@Composable
internal fun displaySqueezeToaster(currentSqueezeCnt: Int){
    when(currentSqueezeCnt) {
        1 -> LemonSqueezeToaster(squeezeCount = currentSqueezeCnt)
        2 -> LemonSqueezeToaster(squeezeCount =currentSqueezeCnt)
        3 -> LemonSqueezeToaster(squeezeCount =currentSqueezeCnt)
        4 -> LemonSqueezeToaster(squeezeCount =currentSqueezeCnt)
        else -> Box{}
    }
}