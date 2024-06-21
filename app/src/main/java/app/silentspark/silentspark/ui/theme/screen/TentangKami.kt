package app.silentspark.silentspark.ui.theme.screen

import android.provider.MediaStore.Images
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import app.silentspark.silentspark.model.Pesanan
import app.silentspark.silentspark.ui.theme.theme.Coklat
import app.silentspark.silentspark.ui.theme.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TentangKamiScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_back_topbar),
                            contentDescription = "Icon",
                            modifier = modifier
                                .width(38.dp)
                                .height(39.dp)
                                .clickable { onBackClick() }
                        )
                        Spacer(modifier = modifier.weight(1f))
                        Text(
                            text = "Tentang Kami",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                                color = Green
                            ),
                            modifier = modifier.padding(end = 16.dp)
                        )
                    }
                },
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {

            }

        // Main Title
        Text(
            text = "Platform Pembelajaran Bahasa Isyarat",
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontFamily(Font(R.font.poppins_bold)),
                color = Coklat// Gunakan warna coklat yang sesuai
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Selamat belajar di SilentSpark\nPijar Pembelajaran Bahasa Isyarat di Indonesia.",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontFamily(Font(R.font.poppins_semibold)),
                color = Coklat
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Percayakan SilentSpark sebagai pilihan Anda untuk belajar Bahasa Isyarat bersama guru terpercaya.",
            style = TextStyle(
                fontWeight = FontFamily(Font(R.font.poppins_regular)),
                 fontSize = 16.sp,
                 color = Coklat
            ),
            modifier = Modifier.padding(bottom = 16.dp)
            )

        // Image

        Image(
            modifier = modifier
                .width(360.dp)
                .height(807.dp),
            painter = painterResource(id = R.drawable.tk2),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Additional Sections
            Row {
                Text(
                    text = "Mengenal ",
                    style = TextStyle(
                        fontWeight = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 16.sp,
                        color = Coklat
                ))
                Text(
                    text = "SilentSpark",
                    style = TextStyle(
                        fontWeight = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 16.sp,
                        color = Green))
            }

        Spacer(modifier = modifier.height(32.dp))


            Image(
                painter = painterResource(R.drawable.tk),
                contentDescription = "",
                modifier = modifier
                    .size(width = 150.dp, height = 100.dp)
                    .padding(start = 35.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = modifier.height(32.dp))

            Text(
            text = "SilentSpark adalah platform pembelajaran Bahasa Isyarat online yang menghubungkan pengajar dan siswa yang ingin mempelajari Bahasa Isyarat. Dengan SilentSpark, siswa dapat mengakses pembelajaran kapan pun mereka mau, dengan jadwal yang dapat disesuaikan sesuai kebutuhan masing-masing. Ini menjadikan SilentSpark sebagai solusi pembelajaran Bahasa Isyarat yang fleksibel dan mudah diakses.",
            style = TextStyle(
                fontWeight = FontFamily(Font(R.font.poppins_regular)),
                fontSize = 16.sp,
                color = Coklat
        ) )
            
            Spacer(modifier = modifier.height(32.dp))

            Row {
                Text(
                    text = "Visi ",
                    style = TextStyle(
                        fontWeight = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 16.sp,
                        color = Coklat
                    ))
                Text(
                    text = "& Misi",
                    style = TextStyle(
                        fontWeight = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 16.sp,
                        color = Green
                    ),

            modifier = Modifier.padding(bottom = 8.dp)
        )


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
                painter = painterResource(R.drawable.vismis),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = modifier.height(32.dp))

            Text(
                text =  "Menjadi pionir dalam memperluas akses dan pemahaman terhadap bahasa isyarat di seluruh Indonesia, mendorong inklusi dan komunikasi yang lebih baik bagi komunitas penyandang cacat pendengaran.\n\n",
                "1. Memberikan akses mudah dan fleksibel ke pembelajaran bahasa isyarat melalui platform digital inovatif dan ramah pengguna.\n"+
                        "2. Menyediakan lingkungan pembelajaran inklusif dan mendukung bagi semua siswa, tanpa memandang latar belakang atau tingkat pendengaran.\n" +
                        "3. Memberikan dukungan berkelanjutan melalui konseling akademik, mentoring, dan sumber daya tambahan untuk memfasilitasi pemahaman dan penguasaan bahasa isyarat.",
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 14.sp,
                    color = Coklat))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTentangKamiScreen() {
        TentangKamiScreen()
}