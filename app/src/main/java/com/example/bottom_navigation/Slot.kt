package com.example.bottom_navigation

data class Slot(
    val number: Int,
    val canBeFilled: Boolean = true,
    var isFilled: Boolean = number % 2 == 0,
    var lastRolled: Boolean = number % 3 == 0
)
