package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import app.silentspark.silentspark.R
import app.silentspark.silentspark.dummy.DataKelas
import app.silentspark.silentspark.ui.theme.components.detailkelas.AksesKelas
import app.silentspark.silentspark.ui.theme.components.detailkelas.Hubungi
import app.silentspark.silentspark.ui.theme.components.detailkelas.TentangGuru
import app.silentspark.silentspark.ui.theme.components.detailkelas.Tugas
import app.silentspark.silentspark.ui.theme.theme.Green
import app.silentspark.silentspark.ui.theme.theme.SilentSparkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailKelasScreen(
    navController: NavHostController,
    kelasId: Int,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
) {
    val kelas = DataKelas.listKelas.firstOrNull { it.id == kelasId }

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
                                .clickable { navController.popBackStack() }
                        )
                        Spacer(modifier = modifier.weight(1f))
                        Text(
                            text = "Detail Kelas",
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
            if (kelas != null) {
                LazyColumn(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                ) {
                    item {
                        Box(
                            modifier = modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(kelas.image),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .height(160.dp)
                                    .width(180.dp)
                                    .clip(RoundedCornerShape(7.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                    item {
                        Box(
                            modifier = modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            TentangGuru(
                                name = kelas.title,
                                date = kelas.desc,
                                bahasa = "Indonesia | English",
                                sesi = kelas.status,
                                modifier = modifier
                                    .padding(8.dp)
                            )
                        }
                    }
                    item {
                        Box(
                            modifier = modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            AksesKelas(
                                topik = "Memahami macam isyarat (Isyando, ASL, BISINDO",
                                linkzoom = "https://us06web.zoom.us/j/89554588370?pwd=fQTIuqCON8Y3AIjo9gGxyRpkMeFOt0.1",
                                modifier = modifier
                                    .padding(8.dp)
                            )
                        }
                    }
                    item {
                        Box(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Tugas(
                                namatugas = "Tugas 1",
                                desctugas = stringResource(id = R.string.lorem),
                                text = "Link",
                                nilai = "nilai",
                                setText = {}
                            )
                        }
                    }
                    item {
                        Box(
                            modifier = modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Hubungi(
                                email = "biancasavador@gmail.com",
                                modifier = modifier
                                    .padding(8.dp)
                            )

                        }
                    }
                }
            }
        }
    )
}


