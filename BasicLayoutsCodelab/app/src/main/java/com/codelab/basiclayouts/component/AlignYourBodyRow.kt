package com.codelab.basiclayouts.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R

@Composable
fun AlignYourBodyRow(
    items: List<String>,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items) {
            AlignYourBodyElement(
                imgRes = R.drawable.ab5_hiit,
                titleRes = R.string.ab5_hiit
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAlignYourBodyRow() {
    MaterialTheme {
        AlignYourBodyRow(
            items = (1..10).map { "${it}" }
        )
    }
}