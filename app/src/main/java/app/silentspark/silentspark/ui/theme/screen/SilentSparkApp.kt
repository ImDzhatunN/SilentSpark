package app.silentspark.silentspark.ui.theme.screen


import App.SilentSpark.silentspark.R
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Tab
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import app.silentspark.silentspark.navigation.NavigationItem
import app.silentspark.silentspark.navigation.Screen

@Composable
fun SilentSparkApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                BerandaSiswaScreen()
            }

            composable(Screen.Kelas.route) {
                KelasSiswa()
            }

            composable(Screen.Pesanan.route) {
                PesananSiswa()
            }

            composable(Screen.Akun.route) {
                AkunSiswa()
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_kelas),
                icon = Icons.Default.Topic,
                screen = Screen.Kelas
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_pesanan),
                icon = Icons.Default.Tab,
                screen = Screen.Pesanan
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_akun),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Akun
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSilentSparkApp() {
    SilentSparkApp()
}