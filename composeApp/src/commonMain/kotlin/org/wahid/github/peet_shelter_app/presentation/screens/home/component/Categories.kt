package org.wahid.github.peet_shelter_app.presentation.screens.home.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.EaseInOutBack
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.wahid.github.peet_shelter_app.domain.model.CategoryItem
import org.wahid.github.peet_shelter_app.theme.Colors
import org.wahid.github.peet_shelter_app.theme.Strings
import org.wahid.github.peet_shelter_app.theme.Shapes.ROUNDED100_CORNER_SHAPE
@Composable
fun Categories(
    modifier: Modifier = Modifier,
    selectedItem: Int,
    categories: List<CategoryItem>,
    onItemClick: (Int) -> Unit,
) {

    LazyRow(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        itemsIndexed(categories) { index, item ->
            CategoryItem(
                modifier = Modifier.fillMaxWidth(),
                icon = painterResource(item.image),
                text = item.name,
                isSelected = index == selectedItem,
                onItemClick = { onItemClick(index) },
                selectedColor = Colors.pinkColor,
                unSelectedColor = Color.White
            )
        }


    }

}

@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    icon: Painter,
    text: String,
    isSelected: Boolean = false,
    onItemClick: () -> Unit,
    selectedColor: Color,
    unSelectedColor: Color,
) {

    val backgroundColor = animateColorAsState(
        targetValue = selectedColor ,
        animationSpec = tween(
            easing = EaseOut,
        )
    )
    val textColor = animateColorAsState(
        targetValue = if (isSelected) Color.White else Color.LightGray,
        animationSpec = tween(
            easing = EaseInOutBack
        )
    )

    Surface(
        modifier = Modifier
            .border(
                color = Color.LightGray,
                width = if (isSelected) 0.dp else 2.dp,
                shape = CircleShape
            )
            .clickable { onItemClick() }
    ) {
        Row(
            modifier = modifier.background(
                color = if (isSelected) backgroundColor.value else unSelectedColor,
                shape = ROUNDED100_CORNER_SHAPE
            ).padding(
                all = 12.dp
            ).padding(end = 14.dp)
                .clip(ROUNDED100_CORNER_SHAPE),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Image(
                modifier = Modifier.clip(CircleShape).size(40.dp),
                painter = icon,
                contentDescription = Strings.peetIcon,
            )

            Text(
                text = text,
                fontWeight = FontWeight.SemiBold,
                fontSize = MaterialTheme.typography.button.fontSize,
                color = textColor.value
            )

        }

    }

}