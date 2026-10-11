package com.example.tugas3

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CharacterCard(
    @StringRes nameRes: Int,
    @StringRes instrumentRes: Int,
    @StringRes hobbyRes: Int,
    @DrawableRes photoRes: Int,
    @ColorRes colorRes: Int,
    modifier: Modifier = Modifier
) {
    val name = stringResource(nameRes)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.card_margin_horizontal),
                vertical = dimensionResource(R.dimen.card_margin_vertical)
            ),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(containerColor = colorResource(colorRes))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(photoRes),
                contentDescription = stringResource(R.string.cd_character_photo, name),
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_image_size))
                    .padding(dimensionResource(R.dimen.image_padding))
            )
            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacer_width)))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = name,
                    fontSize = spResource(R.dimen.text_name),
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.text_primary)
                )
                Text(
                    text = stringResource(R.string.label_instrument, stringResource(instrumentRes)),
                    fontSize = spResource(R.dimen.text_detail),
                    color = colorResource(R.color.text_secondary),
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.detail_spacing_top))
                )
                Text(
                    text = stringResource(R.string.label_hobby, stringResource(hobbyRes)),
                    fontSize = spResource(R.dimen.text_detail),
                    color = colorResource(R.color.text_primary),
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.detail_spacing_top))
                )
            }
            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacer_width)))
            Image(
                painter = painterResource(R.drawable.logo_band),
                contentDescription = stringResource(R.string.cd_band_logo),
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_image_size))
                    .padding(dimensionResource(R.dimen.image_padding))
            )
        }
    }
}