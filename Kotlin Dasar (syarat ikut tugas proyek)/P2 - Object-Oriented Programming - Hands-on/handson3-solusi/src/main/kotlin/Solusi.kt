// sealed class membatasi status hasil jaringan
sealed class NetworkResult {
    object Loading : NetworkResult()
    data class Success(val data: String) : NetworkResult()
    data class Error(val message: String) : NetworkResult()
}

// when-nya exhaustive, tidak butuh cabang else
fun describe(result: NetworkResult): String {
    return when (result) {
        is NetworkResult.Loading -> "Sedang memuat..."
        is NetworkResult.Success -> "Berhasil: ${result.data}"
        is NetworkResult.Error   -> "Gagal: ${result.message}"
    }
}

fun main() {
    println(describe(NetworkResult.Loading))
    println(describe(NetworkResult.Success("Data pengguna berhasil diambil")))
    println(describe(NetworkResult.Error("Koneksi terputus")))
}
