package com.example.bottom_navigation

data class AI(
    val name: String
) {
    override fun toString(): String {
        return name
    }

    companion object {
        @JvmStatic
        val basicAI = listOf(
            AI("TwoFace"),
            AI("No Go Noah"),
            AI("Bail out Beulah"),
            AI("Fearful Fred"),
            AI("Even Steven"),
            AI("Riverboat Ron"),
            AI("Sammy Sixes"),
            AI("Random Rachael"),
        )
    }
}
