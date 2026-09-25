// interface penentuan gaji
interface Payable {
    fun calculateSalary(): Double
}

data class Employee(
    val name: String,
    val baseSalary: Double,
    val bonus: Double
) : Payable {
    override fun calculateSalary(): Double {
        return baseSalary + bonus // gaji = pokok + bonus
    }
}

fun main() {
    val alice = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)

    // buat objek Bob dari data Alice dengan fungsi copy()
    val bob = alice.copy(name = "Bob")

    println("Gaji ${alice.name}: ${alice.calculateSalary()}")
    println("Gaji ${bob.name}: ${bob.calculateSalary()}")

    // data class membandingkan isi data, bukan referensi memori
    val aliceDuplicate = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)
    println("alice == aliceDuplicate? ${alice == aliceDuplicate}")

    println(alice)
}
