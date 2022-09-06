package com.example.bottom_navigation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bottom_navigation.Player
import com.example.bottom_navigation.Slot

class GameViewModel: ViewModel() {


    private var players: List<Player> = emptyList()

    val slots = MutableLiveData(
        (1..6).map { slotNum ->
            Slot(slotNum, slotNum != 6)

        }
    )

    val currentPlayer = MutableLiveData<Player?>()

    val canRoll = MutableLiveData(false)
    val canPass = MutableLiveData(false)

    val currentTurnText = MutableLiveData("")
    val currentStandingsText = MutableLiveData("")

    fun startGame(playerForNewGame: List<Player>) {
        this.players = playerForNewGame
        this.currentPlayer.value = this.players.firstOrNull().apply {
            this?.isRolling = true
        }
        this.canRoll.value = true
    }

    fun pass() {

    }

    fun roll() {

    }
}