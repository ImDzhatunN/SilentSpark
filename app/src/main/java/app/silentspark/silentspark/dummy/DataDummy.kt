package app.silentspark.silentspark.dummy


import app.silentspark.silentspark.R
import app.silentspark.silentspark.model.Bank
import app.silentspark.silentspark.model.Course
import app.silentspark.silentspark.model.KeteranganPesanan
import app.silentspark.silentspark.model.Pesanan

object DataDummy {

    val listCouse = listOf(
        Course(1, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(2, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(3, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(4, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(5, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(6, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(7, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        Course(8, "Course 1", R.drawable.illus_teach, "Description data course", "100.000"),
        )

    val listPesanan = listOf(
        Pesanan(1, "15 Mei 2024", "2 Bulan", "Shopee Pay", "Lunas", 2024, "Pesanan A"),
        Pesanan(2, "15 Mei 2023", "2 Bulan", "Shopee Pay", "Lunas", 2023,  "Pesanan A"),
        Pesanan(3, "15 Mei 2023", "3 Bulan", "Shopee Pay", "Lunas",2023, "Pesanan A"),
        Pesanan(4, "15 Mei 2024", "2 Bulan", "Shopee Pay", "Belum Lunas", 2024, "Pesanan A"),

    )

    val listKeteranganPesanan = listOf(
        KeteranganPesanan("Bianca Savador", "15 Mei 2024", "Rp 680.000", "2 Bulan", "Shopee Pay", "Menunggu Pembayaran", "Rp 680.000"),
    )

    val listbank = listOf(
        Bank(name = "Mandiri"),
        Bank(name = "BNI"),
        Bank(name = "BSI"),
        Bank(name = "BTN"),
    )
}