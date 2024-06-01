package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SiswaLengkapiProfileScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp), Arrangement.Top, Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Siswa Lengkapi Profil",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            IconButton(
                onClick = {}
            ) {
                Icon(imageVector = Icons.Filled.Notifications, contentDescription = "Notifikasi")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Informasi Umum",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Nama Lengkap",
            onValueChange = {},
            label = { Text("Nama Lengkap") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Nama Belakang",
            onValueChange = { /* TODO: Handle last name input change */ },
            label = { Text("Nama Belakang") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Tempat Lahir",
            onValueChange = { /* TODO: Handle birthplace input change */ },
            label = { Text("Tempat Lahir") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Tanggal Lahir",
            onValueChange = { /* TODO: Handle date of birth input change */ },
            label = { Text("Tanggal Lahir") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Jenis Kelamin",
            onValueChange = { /* TODO: Handle gender input change */ },
            label = { Text("Jenis Kelamin") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = "Alamat Lengkap",
            onValueChange = { /* TODO: Handle address input change */ },
            label = { Text("Alamat Lengkap") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* TODO: Handle complete profile button click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Lengkapi Profile Anda")
        }
    }
}

@Preview
@Composable
private fun PreviewSiswaLengkapiProfile() {
    SiswaLengkapiProfileScreen()
}