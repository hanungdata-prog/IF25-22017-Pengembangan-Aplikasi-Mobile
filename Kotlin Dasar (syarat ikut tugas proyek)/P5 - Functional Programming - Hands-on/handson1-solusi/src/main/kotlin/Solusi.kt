// jalankan fungsi 'operation' yang dikirim lewat parameter
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // kirim lambda berbeda untuk tambah, kurang, dan kali
    val tambah = calculate(10, 4) { x, y -> x + y }
    val kurang = calculate(10, 4) { x, y -> x - y }
    val kali   = calculate(10, 4) { x, y -> x * y }

    println("Tambah: $tambah")
    println("Kurang: $kurang")
    println("Kali  : $kali")
}
