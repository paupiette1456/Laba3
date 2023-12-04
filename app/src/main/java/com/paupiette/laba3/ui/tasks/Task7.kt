package com.paupiette.laba3.ui.tasks

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.paupiette.laba3.R
import com.paupiette.laba3.ui.theme.myGray

@Preview(showSystemUi = true)
@Composable
fun NewsList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = news, key = {it.id}) { tidings ->
            ListItem(
                headlineContent = {
                    Text(
                        text = tidings.title,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )},
                leadingContent = {
                    Icon(
                        imageVector = ImageVector.vectorResource(tidings.icon),
                        null)
                },
                supportingContent = {
                    Text(
                        text = tidings.content,
                        color = Color.Black,
                        fontSize = 14.sp

                        )},
                colors = ListItemDefaults.colors(
                    containerColor = myGray
                )
            )
            HorizontalDivider()
        }
    }
}


data class News(
    val id: Int,
    val category: String,
    val title: String,
    val content: String,
    val icon: Int
)


val news = listOf(
    News(1,
        "Спорт",
        "Аргентина - чемпионы",
        "Сборная Аргентины на прошедшем чемпионате мира по футболу...",
        R.drawable.sports),

    News(2,
        "IT",
        "Релиз Jetpack Compose",
        "Google наконец-то выпустила стабильную версию",
        R.drawable.it_news),

    News(3,
        "IT",
        "Релиз Jetpack Compose",
        "Google наконец-то выпустила стабильную версию",
        R.drawable.it_news),

    News(4,
        "IT",
        "Релиз Jetpack Compose",
        "Google наконец-то выпустила стабильную версию",
        R.drawable.it_news),

    News(5,
        "IT",
        "Релиз Jetpack Compose",
        "Google наконец-то выпустила стабильную версию",
        R.drawable.it_news)

)






