package com.example.bookstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bookstore.components.*
import com.example.bookstore.ui.theme.BookStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookStoreTheme {
                // A surface container using the 'background' color from the theme
                MainApplication()
            }
        }
    }
}

private val BooksStore = listOf(
    Books(title = "Fortress of Blood", author = "L.D. Goffigan", cover = R.drawable.crime_and_mystery_l_d_goffigan),
    Books(title = "Last Blood", author = "Alexandra Gregg", cover = R.drawable.last_blood_by_alexandra_gregg),
    Books(title = "Follow me to ground", author = "Sue Rainsford", cover = R.drawable.follow_me_to_ground),
    Books(title = "Stone Dragon", author = "Kathryn O'brien", cover = R.drawable.stone_dragon_by_kathryn_o_brien),
    Books(title = "The nightingale's last blood", author = "Haajar Yamani", cover = R.drawable.the_nightingale_s_last_blood_by_haajar_yamani),
)

private  val BestsellerData = listOf(
    Books(title = "Moritga", author = "Olivia Rice", cover = R.drawable.moritga),
    Books(title = "Araminta", author = "Felicity Harper", cover = R.drawable.araminta),
    Books(title = "Hero at the fall", author = "Alwyn Hamilton", cover = R.drawable.hero_at_the_fall),
    Books(title = "Of fire and ash", author = "Isabel Garcia", cover = R.drawable.of_fire_and_ash),
    Books(title = "Spaw", author = "Rosie Scott", cover = R.drawable.spawn),
    Books(title = "Shades of shadows", author = "Lumen", cover = R.drawable.shades_of_shadows),
)

@Composable
fun MainApplication(){
    Scaffold(
        bottomBar = {
            BottomBarNavigation()
        }
    ) {
        Dashboard()
    }
}

@Composable
fun Dashboard(){
    Column {
        HeadPart()
        Spacer(modifier = Modifier.height(20.dp))
        MyLibrarySection(books = BooksStore, sectionTitle = "My Library")
        Spacer(modifier = Modifier.height(30.dp))
        BestsellerSection(books = BestsellerData, sectionTitle = "Bestsellers")
    }
}





@Preview(showBackground = true)
@Composable
fun DashboardPreview(){
    BookStoreTheme {
        Dashboard()
    }
}

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

@Preview()
@Composable
fun HeadAccountAndSearchPreview(){
    BookStoreTheme {
        HeadPart()
    }
}

@Preview(showBackground = true)
@Composable
fun MyLibrarySectionPreview(){
    BookStoreTheme {
        MyLibrarySection(books = BooksStore, sectionTitle = "My Library")
    }
}

@Preview(showBackground = true)
@Composable
fun BestSellersSectionPreview(){
    BookStoreTheme {
        BestsellerSection(books = BestsellerData, sectionTitle = "Bestsellers")
    }
}

@Preview()
@Composable
fun BottomBarNavigationPreview(){
    BookStoreTheme {
        BottomBarNavigation()
    }
}

@Preview
@Composable
fun MainApplicationPreview(){
    BookStoreTheme {
        MainApplication()
    }
}