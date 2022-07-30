package com.example.bookstore.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import  com.example.bookstore.R


@Composable
fun BottomBarNavigation(){
    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Yellow
    ) {
        BottomNavigationItem(
            selected = true,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.DarkGray,
            icon = {Icon(imageVector = Icons.Filled.Home, contentDescription = null)},
            onClick = { /*TODO*/ },
        )

        BottomNavigationItem(
            selected = false,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color(218,197,167),
            icon = {Icon(painter = painterResource(id = R.drawable.ic_outline_book_24), contentDescription = null)},
            onClick = { /*TODO*/ },
        )

        BottomNavigationItem(
            selected = false,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color(218,197,167),
            icon = {Icon(painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24), contentDescription = null)},
            onClick = { /*TODO*/ },
        )

        BottomNavigationItem(
            selected = false,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color(218,197,167),
            icon = {Icon(painter = painterResource(id = R.drawable.ic_outline_shopping_bag_24), contentDescription = null)},
            onClick = { /*TODO*/ },
        )
    }
}