package com.example.lemonade.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun LemonSqueezeToaster(squeezeCount: Int) {

    // set value to true when lemon image is clicked
    var isToasterVisible by remember {
        mutableStateOf(false)
    }

    // track which toaster to render
    var currentSqueeze by remember {
        mutableIntStateOf(0)
    }

    // toggle isToasterVisible state
    val toggleVisible: ()-> Unit = {
        isToasterVisible = !isToasterVisible
    }

    // ensuring toaster is rendered only one each click
    if( squeezeCount != currentSqueeze ){
        toggleVisible()
        ToastInterval(
            isVisible = isToasterVisible,
            toggleFun =  toggleVisible,
            duration = 2500
        )
        currentSqueeze = squeezeCount

    }
        // control toaster fade-in and fade-out interval
        AnimatedVisibility(
            modifier = Modifier
                .fillMaxWidth(),
            visible = isToasterVisible,
            enter = fadeIn(animationSpec = TweenSpec(durationMillis = 500 ))
        ) {
            ToastFadeIn(squeezeCount)
        }

}