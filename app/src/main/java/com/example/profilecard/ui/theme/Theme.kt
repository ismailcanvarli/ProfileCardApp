package com.example.profilecard.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = DarkFirstColor,
    onPrimary = DarkFirstTextColor,
    secondary = DarkSecondTextColor
)

private val LightColorScheme = lightColorScheme(
    primary = FirstColor,
    onPrimary = FirstTextColor,
    secondary = SecondTextColor
)

@Composable
fun ProfileCardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}