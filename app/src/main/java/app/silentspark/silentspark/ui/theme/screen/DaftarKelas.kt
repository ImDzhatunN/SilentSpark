package app.silentspark.silentspark.ui.theme.screen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.silentspark.silentspark.dummy.DataKelas
import app.silentspark.silentspark.model.Kelas
import app.silentspark.silentspark.ui.theme.components.ItemRowKelas


@Composable
fun DaftarKelas(
    nama: String,
    ListCourse: List<Kelas> = DataKelas.listCouse,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp, start = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = nama,
                color = Color(0xFF67725F)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(ListCourse) { course ->
                ItemRowKelas(image = course.image, title = course.title, desc = course.desc, bulan = course.bulan)
            }
        }
    }
}








@Composable
@Preview(showBackground = true)
fun PreviewDaftarKelas() {
    DaftarKelas("Kelas")
}