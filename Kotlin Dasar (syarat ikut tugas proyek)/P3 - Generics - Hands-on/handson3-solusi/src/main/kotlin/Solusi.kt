open class Animal(val name: String)
class Cat(name: String) : Animal(name)

// 'out' (covariance) agar Container<Cat> bisa dipakai sebagai Container<Animal>
interface Container<out T> {
    fun get(): T
}

class CatContainer(private val cat: Cat) : Container<Cat> {
    override fun get(): Cat = cat
}

fun printAnimalName(container: Container<Animal>) {
    println("Nama hewan: ${container.get().name}")
}

fun main() {
    val catContainer: Container<Cat> = CatContainer(Cat("Whiskers"))
    printAnimalName(catContainer) // kini valid berkat modifier 'out'
}
