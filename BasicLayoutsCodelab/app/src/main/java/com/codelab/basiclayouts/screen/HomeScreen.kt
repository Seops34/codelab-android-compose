package com.codelab.basiclayouts.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.component.AlignYourBodyRow
import com.codelab.basiclayouts.component.FavoriteCollectionGrid
import com.codelab.basiclayouts.component.HomeSection
import com.codelab.basiclayouts.component.SearchBar
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(
            keyword = "",
            onValueChanged = {}
        )
        Spacer(modifier = Modifier.height(16.dp))
        HomeSection(
            titleRes = R.string.align_your_body
        ) {
            AlignYourBodyRow()
        }
        HomeSection(
            titleRes = R.string.favorite_collections
        ) {
            FavoriteCollectionGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
private fun PreviewHomeScreen() {
    MySootheTheme {
        HomeScreen()
    }
}