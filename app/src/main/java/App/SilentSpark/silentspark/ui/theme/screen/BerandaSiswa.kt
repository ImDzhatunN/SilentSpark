package App.SilentSpark.silentspark.ui.theme.screen

import App.SilentSpark.silentspark.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun BerandaSiswa(){
    Column (
        modifier = Modifier.fillMaxSize()){

        Row {
            Image(painter = painterResource(id = R.drawable.rectangle_11siswaprofile), contentDescription ="" ,
                alignment = Alignment.Center)
            Column {
                Text(text = "Ayu",
                    )
                Text(text = "Siswa",
                    text = "Siswa",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        color = Variables.Color1,)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewBerandaSiswa() {
    BerandaSiswa()
}