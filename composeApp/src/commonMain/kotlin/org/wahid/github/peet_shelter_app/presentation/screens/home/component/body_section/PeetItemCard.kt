package org.wahid.github.peet_shelter_app.presentation.screens.home.component.body_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.wahid.github.peet_shelter_app.theme.Colors
import org.wahid.github.peet_shelter_app.theme.EXTRA_SMALL_PADDING
import org.wahid.github.peet_shelter_app.theme.SMALL_PADDING
import peetshelterapp.composeapp.generated.resources.Res
import peetshelterapp.composeapp.generated.resources.detault_star

@Composable
fun PeetItemCard(
    modifier: Modifier = Modifier,
    image: DrawableResource,
    petName: String,
    petDescription: String,
    petAge: String,
    onStarClicked: () -> Unit,
    onItemClick: () -> Unit,
    isFavorite: Boolean = false,
) {

    Column(
        modifier = modifier
            .clickable { onItemClick() }
            .clip(RoundedCornerShape(bottomStart = SMALL_PADDING, bottomEnd = SMALL_PADDING)),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(corner = CornerSize(SMALL_PADDING))
                )
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = "Pet Image",
                contentScale = ContentScale.Crop,
            )
            IconButton(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp),
                onClick = { onStarClicked() }
            ) {
                Image(
                    painter = painterResource(resource = if (isFavorite) Res.drawable.detault_star else Res.drawable.detault_star),
                    contentDescription = "Star Icon",
                    contentScale = ContentScale.Crop,
                )
            }
        }
        Spacer(Modifier.height(EXTRA_SMALL_PADDING))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(EXTRA_SMALL_PADDING),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = petName,
                style = TextStyle(
                    color = Colors.petNameColor,
                    fontSize = MaterialTheme.typography.h6.fontSize,
                    fontWeight = MaterialTheme.typography.h6.fontWeight
                )
            )
            Text(
                text = petAge,
                style = TextStyle(
                    color = Colors.petAgeColor,
                    fontSize = MaterialTheme.typography.body1.fontSize,
                    fontWeight = MaterialTheme.typography.body1.fontWeight
                )
            )

        }
        Spacer(Modifier.height(EXTRA_SMALL_PADDING))
        Text(
            text = petDescription,
            style = TextStyle(
                color = Colors.petDescriptionColor,
                fontSize = MaterialTheme.typography.body2.fontSize,
                fontWeight = MaterialTheme.typography.body2.fontWeight
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

    }

}

@Composable
private fun PreviewPeetItemCard() {
//    PeetItemCard()
}