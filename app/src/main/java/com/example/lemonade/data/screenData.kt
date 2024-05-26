package com.example.lemonade.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.lemonade.R
// screen object img, img description, text
internal data class ScreenData (
    @DrawableRes val screenImg: Int,
    @StringRes val imgDescription: Int,
    @StringRes val screenText: Int
)

// list of screen objects
internal val dataList = listOf (
    ScreenData(
        screenImg = R.drawable.lemon_tree,
        imgDescription = R.string.app_name,
        screenText = R.string.pick_lemon
    ),
    ScreenData(
        screenImg = R.drawable.lemon_tree,
        imgDescription = R.string.tree_description,
        screenText = R.string.pick_lemon
    ),
    ScreenData(
        screenImg = R.drawable.lemon_squeeze,
        imgDescription = R.string.lemon_description,
        screenText = R.string.squeeze_lemon
    ),
    ScreenData(
        screenImg = R.drawable.lemon_drink,
        imgDescription = R.string.glass_full_description,
        screenText = R.string.drink
    ),
    ScreenData(
        screenImg = R.drawable.lemon_restart,
        imgDescription = R.string.glass_empty_description,
        screenText = R.string.refill
    ),


)
