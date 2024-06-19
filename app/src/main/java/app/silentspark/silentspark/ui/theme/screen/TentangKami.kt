package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import app.silentspark.silentspark.R
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items

@Composable
fun TentangKamiScreen(
    modifier: Modifier = Modifier

) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.ic_back),
                contentDescription = "Back Icon",
                modifier = Modifier
                    .size(24.dp)
                    .clickable { /* Handle back action */ }
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Tentang Kami",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Main Title
        Text(
            text = "Platform Pembelajaran Bahasa Isyarat",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A4A4A)
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Description
        Text(
            text = "Selamat belajar di SilentSpark\nPijar Pembelajaran Bahasa Isyarat di Indonesia.\nPercayakan SilentSpark sebagai pilihan Anda untuk belajar Bahasa Isyarat bersama guru terpercaya.",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color(0xFF4A4A4A)
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Image Grid
        GridImages(
            images = listOf(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6,
                R.drawable.image7,
                R.drawable.image8
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Additional Sections
        Text(
            text = "Mengenal SilentSpark",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A4A4A)
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "SilentSpark adalah platform pembelajaran Bahasa Isyarat online yang menghubungkan pengajar dan siswa yang ingin mempelajari Bahasa Isyarat. Dengan SilentSpark, siswa dapat mengakses pembelajaran kapan pun mereka mau, dengan jadwal yang dapat disesuaikan sesuai kebutuhan masing-masing. Ini menjadikan SilentSpark sebagai solusi pembelajaran Bahasa Isyarat yang fleksibel dan mudah diakses.",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color(0xFF4A4A4A)
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Visi & Misi",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A4A4A)
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Add more content for Visi & Misi if needed
    }
}

@Composable
fun GridImages(
    images: List<Int>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
    ) {
        items(images) { image ->
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TentangKamiScreenPreview() {
        TentangKamiScreen()
}
