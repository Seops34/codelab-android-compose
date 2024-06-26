package com.codelabs.state.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelabs.state.ui.theme.BasicStateCodelabTheme

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        var count = 0

        Text(text = "You've had ${count} glasses")
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Add one")
        }
    }

}

@Preview
@Composable
private fun PreviewWaterCounter() {
    BasicStateCodelabTheme {
        WaterCounter()
    }
}