package com.example.bookstore

import androidx.annotation.DrawableRes

data class Books(val title : String, val author : String, @DrawableRes val cover: Int)

