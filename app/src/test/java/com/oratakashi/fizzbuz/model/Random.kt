package com.oratakashi.fizzbuz.model

data class Random(
    override val members: List<Int> = listOf(1,2,3,4)
) : MasterModel()
