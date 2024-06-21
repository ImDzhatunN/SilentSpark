package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.R
import app.silentspark.silentspark.dummy.DataDummy
import app.silentspark.silentspark.model.Pesanan
import app.silentspark.silentspark.ui.theme.components.BoxItemDaftarPesanan
import app.silentspark.silentspark.ui.theme.components.ItemSearchBarPreview
import app.silentspark.silentspark.ui.theme.theme.Coklat
import app.silentspark.silentspark.ui.theme.theme.Green
import app.silentspark.silentspark.ui.theme.theme.SilentSparkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AkunScreen(
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
                            text = "Akun",
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
                Row (  modifier = Modifier
                    .padding(start = 30.dp),
                verticalAlignment = Alignment.CenterVertically)
                {
                    Icon(
                        imageVector =Icons.Outlined.Person ,
                        contentDescription = "Profile",
                        tint = Coklat,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Text(
                        text = "Profile",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                            color = Coklat
                        ),
                        modifier = modifier.padding(start = 20.dp)
                    )
                }
                Spacer(modifier = modifier.height(10.dp))

                Row (  modifier = Modifier
                    .padding(start = 30.dp),
                    verticalAlignment = Alignment.CenterVertically)
                {
                    Image(
                        painter = painterResource(id = R.drawable.ic_about),
                        contentDescription = "Icon",
                        modifier = modifier
                            .size(25.dp)
                            .clickable { onBackClick() }
                    )
                    Text(
                        text = "Tentang Kami",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                            color = Coklat
                        ),
                        modifier = modifier.padding(start = 20.dp)
                    )
                }
                Spacer(modifier = modifier.height(10.dp))

                Row (  modifier = Modifier
                    .padding(start = 30.dp),
                    verticalAlignment = Alignment.CenterVertically)
                {
                    Icon(
                        imageVector =Icons.Outlined.ExitToApp ,
                        contentDescription = "Keluar",
                        tint = Coklat,
                        modifier = Modifier
                            .size(28.dp)


                    )
                    Text(
                        text = "keluar",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                            color = Coklat
                        ),
                        modifier = modifier.padding(start = 20.dp)
                    )
                }


            }
        }
    )
}


@Preview(showSystemUi = true)
@Composable
private fun AkunScreenPreview() {
    SilentSparkTheme {
       AkunScreen()
    }
}
