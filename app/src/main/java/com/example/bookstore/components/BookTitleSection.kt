package com.example.bookstore.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BottomSectionTitle(title: String, author: String){
    Column(horizontalAlignment = Alignment.Start) {
        Text(
            text = title,
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = author,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray,
            fontSize = 9.sp,
            fontStyle = FontStyle.Italic
        )
    }
}