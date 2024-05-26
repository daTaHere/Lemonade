package com.example.lemonade.data

import androidx.annotation.StringRes
import com.example.lemonade.R
// toaster object
internal data class lemonSqueezeData(
    @StringRes val toastMsg: Int
)
// list of toaster messages
internal val squeezeToaster = listOf (
    lemonSqueezeData(R.string.toast_placeholder),
    lemonSqueezeData(R.string.toast_one),
    lemonSqueezeData(R.string.toast_two),
    lemonSqueezeData(R.string.toast_three),
    lemonSqueezeData(R.string.toast_four),
)
