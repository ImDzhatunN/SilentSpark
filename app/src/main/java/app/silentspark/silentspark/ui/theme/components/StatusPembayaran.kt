package app.silentspark.silentspark.ui.theme.components

import App.SilentSpark.silentspark.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.ui.theme.theme.poppinsFamily

@Composable
fun StatusPembayaran(
    text : String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.text3))
    ) {
        Column (modifier = Modifier
            .padding(16.dp)
            .align(Alignment.TopCenter)){
            Text(
                text = "No. Rek/Virtual Account",
                fontFamily = poppinsFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.padding(top=8.dp))
            Text(
                text = text,
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.brown),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.padding(top=3.dp))
            Text(
                text = "0123456789",
                fontFamily = poppinsFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.brown),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.padding(top=3.dp))
            Text(
                text = "Proses verifikasi kurang dari 10 menit",
                fontFamily = poppinsFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Setelah pembayaran berhasil.",
                fontFamily = poppinsFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.padding(top=32.dp))
            Text(
                text = "Lakukan Pembayaran Dalam",
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.brown),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Divider(modifier = modifier.padding(start=32.dp, end=32.dp))
            Spacer(modifier = modifier.padding(32.dp))
            PreviewButtonKonfirmasi()
            Spacer(modifier = modifier.padding(3.dp))
            Text(
                text = "Data pribadi Anda akan digunakan untuk kepentingan",
                fontFamily = poppinsFamily,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "pemesanan, mendukung pengalaman Anda di ",
                fontFamily = poppinsFamily,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "website ini, dan untuk tujuan lain yang di-",
                fontFamily = poppinsFamily,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "jelaskan dalam kebijakan privasi kami",
                fontFamily = poppinsFamily,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text4),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewStatusPembayaran() {
    StatusPembayaran(
        text = "Bank Mandiri"
    )
}