class ScoreBoard(private val skorMentah: List<Int?>) {
    // buang elemen null biar tersisa skor yang valid saja
    val skorValid: List<Int> = skorMentah.filterNotNull()

    fun skorKelulusan(batasLulus: Int): List<Int> {
        // ambil yang >= batasLulus, urutkan dari nilai terbesar
        return skorValid.filter { it >= batasLulus }.sortedDescending()
    }
}

fun cetakRentangGanjil(sampai: Int) {
    for (i in 1..sampai step 2) { // lompat 2 biar dapat angka ganjil saja
        print("$i ")
    }
    println()
}

fun main() {
    val papan = ScoreBoard(listOf(85, null, 72, 90, null, 55, 100))
    println("Skor lulus (>= 70): ${papan.skorKelulusan(70)}")

    cetakRentangGanjil(10)
}
