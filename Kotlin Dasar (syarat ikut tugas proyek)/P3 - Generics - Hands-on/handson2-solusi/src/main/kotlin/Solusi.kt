// batasi T harus Comparable agar elemen bisa dibandingkan
fun <T : Comparable<T>> findMax(items: List<T>): T {
    if (items.isEmpty()) {
        throw IllegalArgumentException("List tidak boleh kosong")
    }

    var maxItem = items[0] // anggap elemen pertama sebagai nilai terbesar
    for (item in items) {
        if (item > maxItem) {
            maxItem = item // perbarui jika ditemukan elemen yang lebih besar
        }
    }
    return maxItem
}

fun main() {
    println(findMax(listOf(3, 7, 2, 9, 4)))
    println(findMax(listOf(1.5, 2.8, 0.3)))
    println(findMax(listOf("apel", "jeruk", "duku")))
}
