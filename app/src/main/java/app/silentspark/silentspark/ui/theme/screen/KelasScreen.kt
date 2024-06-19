package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import app.silentspark.silentspark.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.dummy.DataKelas
import app.silentspark.silentspark.model.Kelas
import app.silentspark.silentspark.ui.theme.components.ItemRowKelas
import app.silentspark.silentspark.ui.theme.theme.Green
import app.silentspark.silentspark.ui.theme.theme.SilentSparkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KelasScreen(
    modifier: Modifier = Modifier,
    listkelas: List<Kelas> = emptyList(),
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
                LazyColumn(
                    modifier = modifier.padding(8.dp)
                ){
                    items(listkelas, key = {it.id}) {
                        ItemRowKelas (kelas = it, statusColour = if (it.status=="Sedang Berlangsung") Color(0xFFBBA661).copy(alpha = 0.25f) else Color(0xFF67725F).copy(alpha = 0.25f),
                            textColor = if (it.status=="Sedang Berlangsung") Color(0xFFAC9062) else Color(0xFF67725F)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                }


            }
        }
    )
}


@Preview(showSystemUi = true)
@Composable
private fun KelasScreenPreview() {
    SilentSparkTheme {
        KelasScreen(listkelas = DataKelas.listKelas)
    }
}


