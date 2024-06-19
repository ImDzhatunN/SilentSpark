package app.silentspark.silentspark.ui.theme.components

import app.silentspark.silentspark.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.ui.theme.theme.Abuabu
import app.silentspark.silentspark.ui.theme.theme.KuningMuda
import app.silentspark.silentspark.ui.theme.theme.PurpleGrey80
import app.silentspark.silentspark.ui.theme.theme.SilentSparkTheme
import app.silentspark.silentspark.ui.theme.theme.poppinsFamily
import app.silentspark.silentspark.ui.theme.theme.putih

@Composable
fun ItemRowKelas(
    modifier: Modifier = Modifier,
    image: Int,
    title: String,
    desc: String,
    bulan : String,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .background(Abuabu)

    ) {
        Row {
            Image(
                painter = painterResource(image),
                contentDescription = "",
                modifier = modifier
                    .size(width = 70.dp, height = 60.dp)
                    .padding(start = 16.dp)
                    .align(Alignment.CenterVertically),
                contentScale = ContentScale.Crop
            )

            Column(modifier.padding(start = 8.dp, top = 8.dp, bottom = 8.dp)) {
                Text(
                    text = title,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 14.sp,
                )
                Text(
                    text = desc,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = putih,
                    fontSize = 10.sp,
                    letterSpacing = 1.sp
                )
                Text(
                    text = bulan,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    color = putih,
                    fontSize = 10.sp,
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp, end = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1f))
        }


    }

    }






@Preview(showBackground = true)
@Composable
private fun Preview() {
    SilentSparkTheme {
        ItemRowKelas(
            image = R.drawable.illus_teach, title = "Bianca Savador", desc = stringResource(
                id = R.string.lorem
            ),
            bulan = "1 bulan"
        )
    }
}