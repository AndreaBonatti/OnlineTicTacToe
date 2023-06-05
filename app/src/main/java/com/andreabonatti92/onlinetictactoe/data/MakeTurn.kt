package com.andreabonatti92.onlinetictactoe.data

import kotlinx.serialization.Serializable

@Serializable
data class MakeTurn(val x: Int, val y: Int)
