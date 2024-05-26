package com.example.lemonade.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.lemonade.data.dataList
import com.example.lemonade.screens.GlassEmptyScreen
import com.example.lemonade.screens.GlassFilledScreen
import com.example.lemonade.screens.LemonSqueezeScreen
import com.example.lemonade.screens.LemonTreeScreen
import com.example.lemonade.screens.WelcomeScreen

@Composable

fun Navigator() {
    // tracking current lemonade making process
    var currentStep by remember {
        mutableIntStateOf(0)
    }
    // set current lemonade process to next step or back to first step
    val nextStep: ()-> Unit = {
        when(currentStep) {
            (dataList.size - 1 )-> currentStep = 1
            else -> currentStep++
        }
        Log.d("Image", "Click-> currentStep:$currentStep")
    }

    // exit making lemonade process
    val onDone: ()-> Unit = {
        Log.d("exit", "Click-> currentStep:$currentStep")
        currentStep = 0
    }
    // navigate to next step or welcome page
    NavigateToStep(step = currentStep, nextStep = nextStep ) { onDone() }
}

// render current screen
@Composable
private fun NavigateToStep (step: Int, nextStep:()-> Unit, onDone:()->Unit) {
    when(step) {
        0 -> WelcomeScreen(screenIdx = step) { nextStep() }
        1 -> LemonTreeScreen(screenIdx = step) { nextStep() }
        2 -> LemonSqueezeScreen(screenIdx = step) { nextStep() }
        3 -> GlassFilledScreen(screenIdx = step) { nextStep() }
        4 -> GlassEmptyScreen(screenIdx = step, nextStep = nextStep){ onDone() }
        else -> LemonTreeScreen(screenIdx = step) { nextStep() }
    }
}
