package com.creativeparser.exp4k.operator

enum class OperatorUnit(val index: Int, val precedence: Int) {

    ADDITION(0,100),
    SUBTRACTION(1,ADDITION.precedence),
    MULTIPLICATION(2,200),
    DIVISION(3,MULTIPLICATION.precedence),
    MODULO(4,DIVISION.precedence),
    POWER(5,300),
    UNARY_MINUS(6,400),
    UNARY_PLUS(7,UNARY_MINUS.precedence)
}
