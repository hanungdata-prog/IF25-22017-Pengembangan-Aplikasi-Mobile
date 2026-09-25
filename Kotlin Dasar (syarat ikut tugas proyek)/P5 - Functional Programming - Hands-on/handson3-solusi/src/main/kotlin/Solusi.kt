fun makeCounter(): () -> Int {
    var count = 0 // state disimpan di luar lambda

    // closure menangkap dan memperbarui variabel count
    return {
        count++
        count
    }
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter() // counterB punya state yang independen

    println(counterA()) // 1
    println(counterA()) // 2
    println(counterA()) // 3

    println(counterB()) // 1
    println(counterB()) // 2
}
