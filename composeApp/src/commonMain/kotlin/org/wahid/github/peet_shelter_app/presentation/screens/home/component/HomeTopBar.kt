package org.wahid.github.peet_shelter_app.presentation.screens.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.wahid.github.peet_shelter_app.theme.Strings
import peetshelterapp.composeapp.generated.resources.Res
import peetshelterapp.composeapp.generated.resources.logo
import peetshelterapp.composeapp.generated.resources.notification


@Composable
fun HomeTopBar(
    modifier: Modifier = Modifier,
    onClickNotification: () -> Unit,
    iconColor: Color
) {
    Row(
        modifier = modifier.statusBarsPadding(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Icon(
            painter = painterResource(Res.drawable.logo),
            contentDescription = Strings.splashScreenIcon,
            tint = iconColor
        )
        IconButton(
            onClick = { onClickNotification() },
            content = {
                Icon(
                    painter = painterResource(Res.drawable.notification),
                    contentDescription = Strings.notificationIcon,
                    tint = Color.Unspecified
                )
            }
        )

    }
}

@Preview
@Composable
private fun PreviewHomeTopBar() {

}