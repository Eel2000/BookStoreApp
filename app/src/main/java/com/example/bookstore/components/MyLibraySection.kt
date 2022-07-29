package com.example.bookstore.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookstore.Books


@Composable
fun MyLibrarySection(
    books: List<Books>,
    sectionTitle: String,
) {
    Column {
        Text(
            text = sectionTitle,
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 10.dp)
                .padding(horizontal = 16.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 10.dp)
        ){
            items(books){item ->
                SectionContent(
                    bookCover = item.cover,
                    title = item.title,
                    author = item.author
                )
            }
        }
    }
}