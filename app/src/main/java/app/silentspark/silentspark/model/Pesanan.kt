package app.silentspark.silentspark.model

import java.time.Year

data class Pesanan(
    val id : Int,
    val date : String,
    val month : String,
    val metodepembayaran : String,
    val status : String,
    val year:   Int,
    val desc:   String

)
