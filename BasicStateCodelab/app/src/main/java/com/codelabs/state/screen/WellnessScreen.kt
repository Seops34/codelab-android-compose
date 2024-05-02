package com.codelabs.state.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelabs.state.component.WaterCounter
import com.codelabs.state.ui.theme.BasicStateCodelabTheme

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    WaterCounter()
}

@Preview
@Composable
private fun PreviewWellnessScreen() {
    BasicStateCodelabTheme {
        WellnessScreen()
    }
}