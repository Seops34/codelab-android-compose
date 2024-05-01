package com.codelab.basiclayouts.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun AlignYourBodyElement(
    @DrawableRes imgRes: Int,
    @StringRes titleRes: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imgRes),
            contentDescription = null,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(titleRes),
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp,
                bottom = 4.dp
            ),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
private fun PreviewAlignYourBodyElement() {
    MySootheTheme {
        AlignYourBodyElement(
            imgRes = R.drawable.ab1_inversions,
            titleRes = R.string.ab1_inversions
        )
    }
}