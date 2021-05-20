package com.oratakashi.fizzbuz.model

data class Roboguru(
    override val members: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
) : MasterModel()
