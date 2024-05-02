package com.codelabs.state.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelabs.state.ui.theme.BasicStateCodelabTheme

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {
    val count = 0

    Text(
        text = "You've had ${count} glasses",
        modifier = modifier
    )
}

@Preview
@Composable
private fun PreviewWaterCounter() {
    BasicStateCodelabTheme {
        WaterCounter()
    }
}