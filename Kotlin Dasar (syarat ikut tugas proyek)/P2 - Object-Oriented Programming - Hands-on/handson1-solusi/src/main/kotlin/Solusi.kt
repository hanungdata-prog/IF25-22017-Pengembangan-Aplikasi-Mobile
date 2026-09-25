// kelas dasar 'open' agar bisa diturunkan oleh kelas lain
open class Vehicle(val name: String, val maxSpeed: Int) {
    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

class Car(name: String, val numberOfDoors: Int) : Vehicle(name, maxSpeed = 180) {
    // override describe untuk menambah info jumlah pintu
    override fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h dan punya $numberOfDoors pintu"
    }
}

class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, maxSpeed = 220) {
    override fun describe(): String {
        val sidecarText = if (hasSidecar) "dengan sidecar" else "tanpa sidecar" // cek ada sidecar atau tidak
        return "$name dapat melaju hingga $maxSpeed km/h ($sidecarText)"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        Car("Toyota", numberOfDoors = 4),
        Motorcycle("Ninja", hasSidecar = false)
    )

    vehicles.forEach { println(it.describe()) }
}
