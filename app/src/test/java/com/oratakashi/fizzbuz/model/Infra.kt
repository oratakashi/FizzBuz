package com.oratakashi.fizzbuz.model

data class Infra(
    override val members : List<Int> = listOf(1, 2, 3)
)  : MasterModel()
