fun welcomeMessage(): String {
    val message = """
        |=====================================
        |Welcome to GAME SUIT Terminal Version
        |=====================================
        |""".trimMargin()
    return message
}

fun checkInput(input: String): Boolean {
    val option = listOf("gunting", "batu", "kertas")
    if (option.contains(input)) {
        return true
    }
    return false
}

fun printResult(playerOne: String, playerTwo: String): String {
    if (playerOne != playerTwo) {
        if (playerOne == "gunting" && playerTwo == "batu") {
            return "PEMAIN 2 MENANG!"
        }
        if (playerOne == "gunting" && playerTwo == "kertas") {
            return "PEMAIN 1 MENANG!"
        }

        if (playerOne == "batu" && playerTwo == "kertas") {
            return "PEMAIN 2 MENANG!"
        }
        if (playerOne == "batu" && playerTwo == "gunting") {
            return "PEMAIN 1 MENANG!"
        }

        if (playerOne == "kertas" && playerTwo == "gunting") {
            return "PEMAIN 2 MENANG!"
        }
        if (playerOne == "kertas" && playerTwo == "batu") {
            return "PEMAIN 1 MENANG!"
        }
    }
    return "DRAW!"
}

fun main(args: Array<String>) {
    println(welcomeMessage())
    print("Masukkan pemain 1: ")
    var playerOne = readLine()?.lowercase()
    playerOne = playerOne?.replace("\\s".toRegex(), "")
    var checkInputPlayerOne = playerOne?.let { checkInput(it) }
    while (checkInputPlayerOne == false) {
        println("Pilihan opsi tidak tersedia 😔. Coba lagi 😁️!!")
        print("Masukkan lagi pemain 1: ")
        playerOne = readLine()?.lowercase();
        playerOne = playerOne?.replace("\\s".toRegex(), "")
        checkInputPlayerOne = playerOne?.let { checkInput(it) }
    }
    print("Masukkan pemain 2: ")
    var playerTwo = readLine()?.lowercase()
    playerTwo = playerTwo?.replace("\\s".toRegex(), "")
    var checkInputPlayerTwo = playerTwo?.let { checkInput(it) }
    while (checkInputPlayerTwo == false) {
        println("Pilihan opsi tidak tersedia 😔. Coba lagi 😁️!!")
        print("Masukkan lagi pemain 2: ")
        playerTwo = readLine()?.lowercase()
        playerTwo = playerTwo?.replace("\\s".toRegex(), "")
        checkInputPlayerTwo = playerTwo?.let { checkInput(it) }
    }

    println("Pemain 1: $playerOne, Pemain 2: $playerTwo, siapakah yang menang??")
    if (playerOne != null && playerTwo != null) {
        println("Hasil: ${printResult(playerOne, playerTwo)} 🚀🚀")
    }
}
