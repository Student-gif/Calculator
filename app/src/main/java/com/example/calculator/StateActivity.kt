package com.example.calculator

import java.lang.Thread.State
// \([^)]*\)    ()
// [0-9]+\^[0-9]     ^^

class StateActivity (){
    val eventList:MutableList<StateClass> = mutableListOf<StateClass>()
    val sfv = Regex("\\([^)]*\\)").findAll("(23+32)*(231+2)")

    fun analitic(data:String)
    {

        StateClass.firstOper= sfv.toList()[1].value
        val FindFirst = Regex("\\([^)]*\\)")

        val findSecond = Regex("[0-9]+\\^[0-9]")
        val ssl = findSecond.matches(data)
    }
}



//fun takeChar(ch:String,fCh:Int,sCh:Int) {
//        when (ch) {
//            "+" -> (fCh+sCh)
//            "-" -> (fCh-sCh)
//            "/" -> (fCh/sCh)
//            "*" -> (fCh*sCh)
//        }
//    }
//   fun SetChar(firstN:Char,sign:Char,secondN:Char)
//    {
//        val readyeventList:MutableList<StateClass> = mutableListOf<StateClass>()
//        readyeventList.add(StateClass(firstN,sign,secondN))
//    }
//    fun destructor(data:String) {
//
//        firstStepCheck(data)
//        for (i in data) {
//            if (i == '(') {
//                while (i != ')') {
//                    continue
//                }
//            }
//        }
//        StateClass.firstOper = data
//    }
//
//    fun firstStepCheck(res:String)
//    {
//        val eventLists:MutableList<Char> = mutableListOf<Char>()
//        for(i in -1..res.length)
//        {
//            if(res[i]=='(')
//            {
//
//            }
//        }
//        if(eventLists.size >= 0)
//        {
//
//            eventLists.remove('(')
//            eventLists.remove(')')
//        }
//
//
//
//    }