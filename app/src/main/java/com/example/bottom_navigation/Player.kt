package com.example.bottom_navigation

data class Player(
    val playerName: String = "",
    val isHuman: Boolean = true,
    val selectedAI : AI? = null
) {
    var pennies: Int = defaultPennyCount

    fun addPennies(count: Int = 1) {
        pennies += 1
    }
    var isRolling: Boolean = true

    companion object {
        const val defaultPennyCount = 10
    }


}
