package com.paupiette.laba3.ui.tasks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun TwoLineListItem() {
    Column {
        repeat(5) {
            ListItem(
                headlineContent = { Text("Two line list item with trailing") },
                supportingContent = { Text("Secondary text") },
                trailingContent = { Text("icon 24x24") },
                leadingContent = {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Localized description",
                    )
                }
            )
            HorizontalDivider()
        }
    }
}

@Composable
fun HorizontalDivider() {
    Divider(
        color = Color.Gray,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )
}
