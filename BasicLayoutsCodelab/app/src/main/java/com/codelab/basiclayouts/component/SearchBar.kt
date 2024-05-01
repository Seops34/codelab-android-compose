package com.codelab.basiclayouts.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun SearchBar(
    keyword: String,
    modifier: Modifier = Modifier,
    onValueChanged: (String) -> Unit
) {
    TextField(
        value = keyword,
        onValueChange = onValueChanged,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp),
        placeholder = {
            Text("Search")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        )
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewSearchBar() {
    MySootheTheme {
        SearchBar(
            keyword = "",
            onValueChanged = {}
        )
    }
}