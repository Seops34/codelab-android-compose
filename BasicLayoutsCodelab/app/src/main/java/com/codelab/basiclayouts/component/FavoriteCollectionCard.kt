package com.codelab.basiclayouts.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun FavoriteCollectionCard(
    @DrawableRes imgRes: Int,
    @StringRes titleRes: Int,
    modifier: Modifier = Modifier
) {

    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant
    ) {
        Row(
            modifier = modifier.width(255.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(imgRes),
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(titleRes),
                modifier = Modifier.weight(1f, true),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview
@Composable
private fun PreviewFavoriteCollectionCard() {
    MySootheTheme {
        FavoriteCollectionCard(
            imgRes = R.drawable.fc2_nature_meditations,
            titleRes = R.string.fc2_nature_meditations
        )
    }
}