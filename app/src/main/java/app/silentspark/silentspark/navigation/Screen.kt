package app.silentspark.silentspark.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Kelas: Screen("kelas")
    data object Pesanan: Screen("pesanan")
    data object Akun: Screen("akun")
}
