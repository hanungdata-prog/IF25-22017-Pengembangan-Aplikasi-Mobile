// kelas generik Box untuk menyimpan data bertipe T
class Box<T>(val value: T) {
    // fungsi map mengubah isi Box menjadi Box<R> baru
    fun <R> map(transform: (T) -> R): Box<R> {
        return Box(transform(value))
    }
}

fun main() {
    val intBox = Box(23)
    println("intBox.value = ${intBox.value}")

    val cupBox = Box("cup")
    println("cupBox.value = ${cupBox.value}")

    val stringBox = intBox.map { "Angka: $it" } // ubah Box<Int> jadi Box<String>
    println("stringBox.value = ${stringBox.value}")

    val lengthBox = cupBox.map { it.length } // ambil panjang string sebagai Int
    println("lengthBox.value = ${lengthBox.value}")
}
