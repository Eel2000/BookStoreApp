package com.example.bookstore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.bookstore.Books


val  bestsellerMenu = listOf<String>(
    "Popular","Novels","Newest"
)

@Composable
fun BestsellerSection(
    books: List<Books>,
    sectionTitle: String,
) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = sectionTitle,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 5.dp)
                    .padding(horizontal = 16.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "See more >",
                style = MaterialTheme.typography.subtitle2,
                fontStyle = FontStyle.Italic,
                color = Color.Gray,
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 5.dp)
                    .padding(horizontal = 16.dp)
            )

        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(books) { item ->
                BestsellerSectionContent(
                    bookCover = item.cover
                )
            }
        }
    }
}