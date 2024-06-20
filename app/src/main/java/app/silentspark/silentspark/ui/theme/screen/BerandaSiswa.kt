package app.silentspark.silentspark.ui.theme.screen

import app.silentspark.silentspark.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.dummy.DataDummy
import app.silentspark.silentspark.model.Course
import app.silentspark.silentspark.state.UiState
import app.silentspark.silentspark.ui.theme.components.BannerMain
import app.silentspark.silentspark.ui.theme.components.ItemBeranda
import app.silentspark.silentspark.ui.theme.theme.Coklat
import app.silentspark.silentspark.viewmodel.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun BerandaSiswaScreen(
    viewModel: HomeViewModel = koinViewModel()
){

    val state by viewModel.uiState.collectAsState()

    when(val uiState = state){
        is UiState.Loading -> {

        }

        is UiState.Error -> {

        }
        is UiState.Success -> {
            BerandaSiswaContent(nama = "Ayu Fernanda", listCourse = uiState.data)

        }
    }

}

@Composable
fun BerandaSiswaContent(
    nama : String,
    listCourse : List<Course> = emptyList(),

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp)
    ) {

        Row(
            modifier = Modifier.padding(top = 8.dp, start = 8.dp)
        ) {
            Image(
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(38.dp)
                    .align(Alignment.CenterVertically),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.img_dummy),
                contentDescription = "",
                alignment = Alignment.Center,
            )
            Column( modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = nama,
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 14.sp,
                    color = Coklat)

                Text(
                    text = "Siswa",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 14.sp,
                    color = Coklat)

            }
            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_notif),
                contentDescription = "notification")
        }

        Row(modifier = Modifier.padding(top = 16.dp)) {
            Text(
                text = stringResource(id = R.string.say_hi, nama),
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 14.sp,
                    color = Coklat
            )
            Image(painter = painterResource(id = R.drawable.ic_say_hi), contentDescription = "Icon say hi", modifier = Modifier.padding(start = 8.dp))
        }

        BannerMain(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = 8.dp))

        Text(text = stringResource(id = R.string.text_nav_main),
            color = Coklat ,
            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
            fontSize = 14.sp,
            modifier = Modifier
            .padding(top = 16.dp)
            .align(Alignment.CenterHorizontally))

        LazyColumn {
            items(listCourse) { course ->
                ItemBeranda(image = course.image,
                    title = course.title,
                    desc = course.desc,
                    price = course.price,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                        .clickable { })
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewBerandaSiswa() {
    BerandaSiswaContent("Aldy",
        listCourse = DataDummy.listCouse
    )
}