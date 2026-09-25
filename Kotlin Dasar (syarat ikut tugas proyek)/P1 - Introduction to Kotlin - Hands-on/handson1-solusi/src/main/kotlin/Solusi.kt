fun describeProfile(nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {
    // format umur jika ada isinya, atau pakai default saat null
    val umurText = umur?.let { "$it tahun" } ?: "umur tidak diketahui"
    return "Nama: $nama, Umur: $umurText, Kota: $kota" // gabung pakai string template
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}
