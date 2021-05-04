package com.oratakashi.fizzbuz

import org.junit.Test


class FizzBuzz {

    fun showFizzBuzz(number : Int){
        for(i in 1 until number + 1){
            if(i % 3 == 0 && i % 5 == 0){
                println("FizzBuzz")
            }else if(i % 5 == 0){
                println("Buzz")
            }else if(i % 3 == 0 ){
                println("Fizz")
            }else{
                println(i)
            }
        }
    }

    @Test
    fun testFizzBuzz(){
        showFizzBuzz(15)
    }
}