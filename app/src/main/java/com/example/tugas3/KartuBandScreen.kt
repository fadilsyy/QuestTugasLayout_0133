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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth

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
        CharacterCard(
            nameRes = R.string.name_bocchi,
            instrumentRes = R.string.instrument_bocchi,
            hobbyRes = R.string.hobby_bocchi,
            photoRes = R.drawable.img_bocchi,
            colorRes = R.color.card_bocchi_bg
        )
        CharacterCard(
            nameRes = R.string.name_nijika,
            instrumentRes = R.string.instrument_nijika,
            hobbyRes = R.string.hobby_nijika,
            photoRes = R.drawable.img_nijika,
            colorRes = R.color.card_nijika_bg
        )
        CharacterCard(
            nameRes = R.string.name_kita,
            instrumentRes = R.string.instrument_kita,
            hobbyRes = R.string.hobby_kita,
            photoRes = R.drawable.img_kita,
            colorRes = R.color.card_kita_bg
        )
        CharacterCard(
            nameRes = R.string.name_ryo,
            instrumentRes = R.string.instrument_ryo,
            hobbyRes = R.string.hobby_ryo,
            photoRes = R.drawable.img_ryo,
            colorRes = R.color.card_ryo_bg
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = stringResource(R.string.copyright),
                fontSize = spResource(R.dimen.text_copyright),
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.copyright_bottom_padding))
            )
        }
    }
}