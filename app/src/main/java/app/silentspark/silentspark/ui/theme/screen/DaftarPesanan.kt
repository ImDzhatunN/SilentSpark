package app.silentspark.silentspark.ui.theme.screen

import app.silentspark.silentspark.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.dummy.DataDummy
import app.silentspark.silentspark.model.Pesanan
import app.silentspark.silentspark.ui.theme.components.BoxItemDaftarPesanan
import app.silentspark.silentspark.ui.theme.components.ItemSearchBarPreview
import app.silentspark.silentspark.ui.theme.theme.Coklat
import app.silentspark.silentspark.ui.theme.theme.Green
import app.silentspark.silentspark.ui.theme.theme.SilentSparkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPesanan(
    modifier: Modifier = Modifier,
    listPesan: List<Pesanan> = emptyList(),
    onBackClick: () -> Unit = {},
) {
    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    val filteredList = listPesan.filter {
        it.desc.contains(query, ignoreCase = true)
    }

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
                            text = "Daftar Pesanan",
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
                ItemSearchBarPreview()

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    item {
                        Text(
                            text = "2024",
                            style = TextStyle(
                                fontSize = 22.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                                color = Coklat// Gunakan warna coklat yang sesuai
                            ),
                            modifier = Modifier.padding(start = 24.dp, top = 16.dp)
                        )
                    }
                    items(filteredList.filter { it.year == 2024 }, key = { it.id }) { pesanan ->
                        BoxItemDaftarPesanan(
                            pesanan = pesanan,
                            statusColour = if (pesanan.status == "Belum Lunas") Color(0xFFBBA661).copy(alpha = 0.25f) else Color(0xFF67725F).copy(alpha = 0.25f),
                            textColor = if (pesanan.status == "Belum Lunas") Color(0xFFAC9062) else Color(0xFF67725F)
                        )
                    }
                    item {
                        Text(
                            text = "2023",
                            style = TextStyle(
                                fontSize = 22.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                                color = Coklat
                            ),
                            modifier = Modifier.padding(start = 24.dp, top = 16.dp)
                        )
                    }
                    items(filteredList.filter { it.year == 2023 }, key = { it.id }) { pesanan ->
                        BoxItemDaftarPesanan(
                            pesanan = pesanan,
                            statusColour = if (pesanan.status == "Belum Lunas") Color(0xFFBBA661).copy(alpha = 0.25f) else Color(0xFF67725F).copy(alpha = 0.25f),
                            textColor = if (pesanan.status == "Belum Lunas") Color(0xFFAC9062) else Color(0xFF67725F)
                        )
                    }
                }
            }
        }
    )
}


@Preview(showSystemUi = true)
@Composable
private fun DaftarPesananPreview() {
    SilentSparkTheme {
        DaftarPesanan(listPesan = DataDummy.listPesanan)
    }
}
