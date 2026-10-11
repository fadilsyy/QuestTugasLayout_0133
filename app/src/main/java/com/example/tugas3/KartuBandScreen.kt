package com.example.tugas3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun KartuBandScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = dimensionResource(R.dimen.screen_top_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.title_band),
            fontSize = spResource(R.dimen.text_title),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.subtitle_band),
            fontSize = spResource(R.dimen.text_subtitle),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.header_spacer_height)))
    }
}