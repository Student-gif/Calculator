package com.example.calculator
class StateActivity (){
    val eventList:MutableList<StateClass> = mutableListOf<StateClass>()
    //todo сделать так чтобы сдезь был список обьектов внутри которых потенциальные выражения  далее надо решить проблему счёта этих выражений
    fun takeChar(ch:String,fCh:Int,sCh:Int) {

        when (ch) {
            "+" -> (fCh+sCh)
            "-" -> (fCh-sCh)
            "/" -> (fCh/sCh)
            "*" -> (fCh*sCh)
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
    }
    fun SetChar(firstN:Int,sign:String,secondN:Int)
    {
        eventList.add(StateClass(firstN,sign,secondN))
    }
    fun destructor(data:String)
    {
        val res = data.split("+-*/")
        for(i in res){
            i.toIntOrNull()
        }
    }

}

