package com.paupiette.laba3.ui.tasks

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LazyGrids() {
    LazyVerticalGrid(
        GridCells.Adaptive(minSize = 90.dp),
        state = rememberLazyGridState(),
        contentPadding = PaddingValues(10.dp)
    ) {
        items(12) { index ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.padding(5.dp).fillMaxSize()
            ) {

                Text(
                    "$index",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier.width(120.dp)
                )
            }
        }
    }
}