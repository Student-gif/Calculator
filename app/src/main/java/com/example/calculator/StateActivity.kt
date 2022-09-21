package com.example.calculator
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

