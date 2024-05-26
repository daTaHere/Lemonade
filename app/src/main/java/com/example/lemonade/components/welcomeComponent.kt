package com.example.lemonade.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.R
import com.example.lemonade.data.dataList
import com.example.lemonade.ui.theme.LeafGreen

// render welcome screen image
@Composable
fun WelcomeImgComponent(index: Int) {
    Image(
        modifier = Modifier
            .height(200.dp),
        painter = painterResource(id = dataList[index].screenImg),
        contentDescription = stringResource(id = dataList[index].imgDescription)
    )
    WelcomeGreetingComponent()
}

// render welcome screen greeting text
@Composable
fun WelcomeGreetingComponent() {
    Text(
        text = stringResource(id = R.string.welcome),
        color = LeafGreen,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 82.sp,
            fontWeight = FontWeight.ExtraBold,
        )
    )
}