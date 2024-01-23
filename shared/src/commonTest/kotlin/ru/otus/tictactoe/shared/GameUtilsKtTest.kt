package ru.otus.tictactoe.shared

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.Test

internal class GameUtilsKtTest {
    @Test
    fun boardFullIfFull() {
        assertTrue { tieBoard.isFull() }
    }

    @Test
    fun boardNotFullIfNotFull() {
        assertFalse { emptyBoard.isFull() }
    }

    @Test
    fun computerWinsIfPossible() {
        assertEquals(6, computerWinsBoard.computer())
    }

    @Test
    fun computerBlocksIfPossible() {
        assertEquals(1, playerWinsBoard.computer())
    }
}