package com.oratakashi.fizzbuz

import com.oratakashi.fizzbuz.model.*
import org.junit.Test
import kotlin.reflect.KClass

/**
 * “infra”: [1,2,3], “general“: [1,2,3,4,5,6,7], “devops”: [1,2,3], “ops”: [1,2,3], “roboguru”: [1,2,3,4,5,6,7]
[[“infra”, “devops”, “ops”], [“general”, “roboguru”]]
 */

class ArruGrouping {


    @Test
    fun testGroup(){
        val listSame : MutableList<List<String>> = ArrayList()

        val instanceClass = listOf<MasterModel>(
            Infra(),
            General(),
            DevOps(),
            Ops(),
            Roboguru(),
        )

        val grouping = instanceClass.groupBy {
            it.members
        }

        val group1 = grouping[listOf(1,2,3)]
        val group2 = grouping[listOf(1,2,3,4,5,6,7)]

        val group1Name : MutableList<String> = ArrayList()
        val group2Name : MutableList<String> = ArrayList()

        group1?.forEach {
            group1Name.add("${it::class.simpleName}")
        }

        listSame.add(group1Name)

        group2?.forEach {
            group2Name.add("${it::class.simpleName}")
        }

        listSame.add(group2Name)

        println(listSame)
    }


}