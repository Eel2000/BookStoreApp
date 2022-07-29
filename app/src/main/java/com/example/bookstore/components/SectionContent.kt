package com.example.bookstore.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SectionContent(@DrawableRes bookCover: Int, title: String, author: String){
    Column (modifier = Modifier.background(Color.White)){
        BookCard(bookCover = bookCover)
        Spacer(modifier = Modifier.height(10.dp))
        BottomSectionTitle(title = title, author= author)
    }
}