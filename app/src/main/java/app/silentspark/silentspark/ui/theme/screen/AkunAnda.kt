package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.silentspark.silentspark.R

@Composable
fun AccountScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Handle back button click */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "Back"
                )
            }

            Text(
                text = "Akun",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            // Placeholder for additional action or empty space
            Spacer(modifier = Modifier.width(48.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.placeholder_image),
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxSize()
            )

            IconButton(
                onClick = { /* Handle change profile picture click */ },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(32.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_camera),
                    contentDescription = "Change Profile Picture"
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Handle profile button click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Profile")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* Handle about us button click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tentang Kami")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* Handle logout button click */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Keluar")
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Handle beranda button click */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "Beranda"
                )
            }

            IconButton(onClick = { /* Handle jadwal button click */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_calendar),
                    contentDescription = "Jadwal"
                )
            }

            IconButton(onClick = { /* Handle laporan button click */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_report),
                    contentDescription = "Laporan"
                )
            }

            IconButton(onClick = { /* Handle akun button click */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_account),
                    contentDescription = "Akun"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAccountScreen() {
    AccountScreen()
}