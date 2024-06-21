package app.silentspark.silentspark.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Kelas: Screen("kelas")
    data object DetailKelas: Screen("detail_kelas")
    data object Pesanan: Screen("daftar_pesanan")
    data object TandaTerima: Screen("tanda_terima")
    data object Akun: Screen("akun")
    data object Login: Screen("login")
    data object SignUp: Screen("signup")
}
