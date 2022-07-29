package com.example.bookstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bookstore.ui.theme.BookStoreTheme
import com.example.bookstore.components.BookCard
import com.example.bookstore.components.SectionContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookStoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .size(10.dp),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

private val BooksStore = listOf(
    Books(title = "Fortress of Blood", author = "L.D. Goffigan", cover = R.drawable.crime_and_mystery_l_d_goffigan),
    Books(title = "Last Blood", author = "Alexandra Gregg", cover = R.drawable.last_blood_by_alexandra_gregg),
    Books(title = "Follow me to the ground", author = "Sue Rainsford", cover = R.drawable.follow_me_to_ground),
    Books(title = "Stone Dragon", author = "Kathryn O'brien", cover = R.drawable.stone_dragon_by_kathryn_o_brien),
    Books(title = "The nightingale's last blood", author = "Haajar Yamani", cover = R.drawable.the_nightingale_s_last_blood_by_haajar_yamani),
)



@Preview()
@Composable
fun BookCardPreview(){
    BookStoreTheme {
        BookCard(
            bookCover = R.drawable.last_blood_by_alexandra_gregg
        )
    }
}

@Preview()
@Composable
fun SectionContentPreview(){
    BookStoreTheme {
        SectionContent(
            bookCover = R.drawable.last_blood_by_alexandra_gregg,
            title = "Last Blood",
            author = "Alexandra Gregg"
        )
    }
}