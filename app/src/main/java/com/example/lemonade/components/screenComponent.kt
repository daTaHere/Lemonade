package com.example.lemonade.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.R
import com.example.lemonade.data.dataList
import com.example.lemonade.ui.theme.DarkIceBule
import com.example.lemonade.ui.theme.LeafGreen

// render yellow banner and app name at top of screen
@Composable
fun AppBannerComponent(
    modifier: Modifier = Modifier
) {
        Column(modifier = modifier
            .fillMaxWidth()) {
            HeadingTextComponent()
        }
}

// render heading text
@Composable
fun HeadingTextComponent(
    modifier: Modifier = Modifier
) {
    Row (modifier= Modifier
        .fillMaxWidth()
        .height(88.dp)
        .background(color = Color.Yellow),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = modifier
                .paddingFromBaseline(bottom = 22.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        )
    }
}

// render clickable image
@Composable
fun ScreenImgComponent(index: Int, onClick:()-> Unit) {
    Image(
        modifier = Modifier
            .height(280.dp)
            .clip(RoundedCornerShape(30.dp))
            .width(280.dp)
            .background(color = LeafGreen)
            .padding(20.dp)
            .clickable(onClick = onClick),
        painter = painterResource(id = dataList[index].screenImg),
        contentDescription = stringResource(id = dataList[index].imgDescription),
    )
}

// render normal text
@Composable
fun ScreenTextComponent(index: Int) {
    Text(
        text = stringResource(id = dataList[index].screenText),
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
    )
}

// render glass filled text
@Composable
fun TextEnjoyComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(id = R.string.enjoy),
            color = DarkIceBule,
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
            )
        )
    }
}

// render clickable button
@Composable
fun ButtonComponent(btnText: Int, color: Color, btnClick:()-> Unit) {
    Button(
        modifier = Modifier,
        onClick = btnClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.Black
        ),
        border = BorderStroke(2.dp, Color.LightGray)
    ) {
        Text(
            text = stringResource(id = btnText),
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

// render spacer between composable
@Composable
fun ScreenSpacer(padding: Dp = 38.dp) {
    Spacer( modifier = Modifier
        .fillMaxWidth()
        .height(padding)
    )
}