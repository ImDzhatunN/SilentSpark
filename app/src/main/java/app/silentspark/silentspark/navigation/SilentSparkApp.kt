package app.silentspark.silentspark.navigation


import app.silentspark.silentspark.R
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.Tab
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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import app.silentspark.silentspark.ui.theme.screen.AkunScreen
import app.silentspark.silentspark.ui.theme.screen.BerandaSiswaScreen
import app.silentspark.silentspark.ui.theme.screen.DetailKelasScreen
import app.silentspark.silentspark.ui.theme.screen.KelasScreen
import app.silentspark.silentspark.ui.theme.screen.LoginScreen
import app.silentspark.silentspark.ui.theme.screen.SignUpScreen
import app.silentspark.silentspark.ui.theme.theme.Abuabu
import app.silentspark.silentspark.ui.theme.theme.KuningMuda

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
            startDestination = Screen.Login.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Login.route) {
                LoginScreen(navController = navController)
            }
            composable(Screen.SignUp.route) {
                SignUpScreen(navController = navController)
            }

            composable(Screen.Home.route) {
                BerandaSiswaScreen(navController = navController)
            }

            composable("kelas") {
                KelasScreen(navController = navController)
            }

            composable("kelas_screen") {
                KelasScreen(navController = navController)
            }
            composable(
                route = "detail_kelas_screen/{kelasId}",
                arguments = listOf(navArgument("kelasId") { type = NavType.IntType })
            ) { backStackEntry ->
                val kelasId = backStackEntry.arguments?.getInt("kelasId") ?: 0
                DetailKelasScreen(navController = navController, kelasId = kelasId)
            }







            composable(Screen.Akun.route) {
                AkunScreen(navController = navController)
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
                icon = Icons.Default.Tab,
                screen = Screen.Kelas
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_pesanan),
                icon = Icons.Filled.ReceiptLong,
                screen = Screen.Pesanan
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_akun),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Akun
            )
        )

        navigationItems.map { item ->
            val isSelected = currentRoute == item.screen.route
            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (isSelected) KuningMuda else Abuabu
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if (isSelected) KuningMuda else Abuabu
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSilentSparkApp() {
    SilentSparkApp()
}