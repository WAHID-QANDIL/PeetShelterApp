package org.wahid.github.peet_shelter_app.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.AppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.wahid.github.peet_shelter_app.domain.model.CategoryItem
import org.wahid.github.peet_shelter_app.presentation.screens.home.component.Categories
import org.wahid.github.peet_shelter_app.presentation.screens.home.component.HomeTopBar
import org.wahid.github.peet_shelter_app.presentation.screens.home.component.body_section.PeetItemCard
import org.wahid.github.peet_shelter_app.utils.Constants.HOME_SCREEN_PADDING
import peetshelterapp.composeapp.generated.resources.Res
import peetshelterapp.composeapp.generated.resources.cat1
import peetshelterapp.composeapp.generated.resources.cat2
import peetshelterapp.composeapp.generated.resources.cat3


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
        .padding(horizontal = HOME_SCREEN_PADDING),
) {

    var selectedItem by remember { mutableIntStateOf(0) }

    val category = listOf<CategoryItem>(
        CategoryItem(name = "All", image = Res.drawable.cat1),
        CategoryItem(name = "Dogs", image = Res.drawable.cat2),
        CategoryItem(name = "Cats", image = Res.drawable.cat3)
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HomeTopBar(
            modifier = Modifier.fillMaxWidth(),
            iconColor = Color.Black,
            onClickNotification = {}
        )
        Categories(
            modifier = Modifier.fillMaxWidth(),
            selectedItem = selectedItem,
            categories = category,
            onItemClick = {selectedItem = it}
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ) {
            items(10) { index ->
                PeetItemCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(AppBarDefaults.ContentPadding),
                    image = Res.drawable.cat1,
                    petName = "Cat $index",
                    petDescription = "This is a cat",
                    petAge = "2 years",
                    onStarClicked = {},
                    onItemClick = {}
                )

            }
        }


    }

}

@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}