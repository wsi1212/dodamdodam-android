package com.b1nd.dodam.designsystem.theme

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.b1nd.dodam.designsystem.R
import com.b1nd.dodam.designsystem.icons.Calendar
import com.b1nd.dodam.designsystem.icons.Home
import com.b1nd.dodam.designsystem.icons.Meal
import com.b1nd.dodam.designsystem.icons.More
import com.b1nd.dodam.designsystem.icons.Out

@Composable
fun CheckCircleIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = ImageVector.vectorResource(R.drawable.check_circle),
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun CheckIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = ImageVector.vectorResource(R.drawable.check),
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun RightArrowIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = ImageVector.vectorResource(R.drawable.right_arrow),
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun HomeIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = Home,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun MealIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = Meal,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun OutIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = Out,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun CalendarIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = Calendar,
        contentDescription = contentDescription,
        tint = tint,
    )
}

@Composable
fun MoreIcon(modifier: Modifier = Modifier, contentDescription: String? = null, tint: Color = Gray300) {
    Icon(
        modifier = modifier.size(24.dp),
        imageVector = More,
        contentDescription = contentDescription,
        tint = tint,
    )
}
