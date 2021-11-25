package com.github.w0819.game

import com.github.w0819.game.util.GameStatus
import com.github.w0819.game.timer.StartAction
import com.github.w0819.game.team.UHCTeam
import com.github.w0819.game.timer.UHCTimer
import com.github.w0819.game.util.GameUtils
import com.github.w0819.game.world.UHCWorldManager
import org.bukkit.entity.Player

class UHCGame private constructor(
    @Suppress("WeakerAccess") val players: MutableList<Player>
) {
    companion object {
        @JvmStatic
        fun create(players: List<Player>): UHCGame {
            return UHCGame(players.toMutableList())
        }

        const val PLAYERS_PER_TEAM = 3
    }

    var gameStatus: GameStatus = GameStatus.BEFORE_START
        private set

    @Suppress("WeakerAccess")
    lateinit var timer: UHCTimer
        private set

    lateinit var teams: List<UHCTeam>
        private set

    fun modifyGameStatus(newStatus: GameStatus) {
        if (newStatus.index > gameStatus.index) {
            gameStatus = newStatus
        }
    }

    fun addPlayer(player: Player) {
        players.add(player)
    }

    fun removePlayer(player: Player): Boolean {
        return players.remove(player)
    }

    fun startGame(vararg startActions: StartAction<*>) {
        teams = UHCTeam.divide(players, PLAYERS_PER_TEAM)
        timer = UHCTimer(this, startActions)
        timer.initTimer()
        GameUtils.spreadTeams(teams, UHCWorldManager.generateWorld().overworld)

    }

    fun stopGame() {
        timer.cancelTimer()
    }
}