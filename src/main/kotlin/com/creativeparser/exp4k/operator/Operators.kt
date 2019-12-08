package com.creativeparser.exp4k.operator

class Operators {

    private val queue = arrayOfNulls<Operator>(8)

    init {
        queue[OperatorUnit.ADDITION.index] = object : Operator("+", 2, true, OperatorUnit.ADDITION) {
            override fun apply(vararg args: Double): Double {
                return args[0] + args[1]
            }
        }
        queue[OperatorUnit.SUBTRACTION.index] = object : Operator("-", 2, true, OperatorUnit.SUBTRACTION) {
            override fun apply(vararg args: Double): Double {
                return args[0] - args[1]
            }
        }
        queue[OperatorUnit.UNARY_MINUS.index] = object : Operator("-", 1, false, OperatorUnit.UNARY_MINUS) {
            override fun apply(vararg args: Double): Double {
                return -args[0]
            }
        }
        queue[OperatorUnit.UNARY_PLUS.index] = object : Operator("+", 1, false, OperatorUnit.UNARY_PLUS) {
            override fun apply(vararg args: Double): Double {
                return args[0]
            }
        }
        queue[OperatorUnit.MULTIPLICATION.index] = object : Operator("*", 2, true, OperatorUnit.MULTIPLICATION) {
            override fun apply(vararg args: Double): Double {
                return args[0] * args[1]
            }
        }
        queue[OperatorUnit.DIVISION.index] = object : Operator("/", 2, true, OperatorUnit.DIVISION) {
            override fun apply(vararg args: Double): Double {
                if (args[1] == 0.0) {
                    throw ArithmeticException("Division by zero")
                }
                return args[0] / args[1]
            }
        }
        queue[OperatorUnit.POWER.index] = object : Operator("^", 2, true, OperatorUnit.POWER) {
            override fun apply(vararg args: Double): Double {
                return Math.pow(args[0], args[1])
            }
        }
        queue[OperatorUnit.MODULO.index] = object : Operator("%", 2, true, OperatorUnit.MODULO) {
            override fun apply(vararg args: Double): Double {
                if (args[1] == 0.0) {
                    throw ArithmeticException("Division by zero")
                }
                return args[0] % args[1]
            }
        }
    }

    fun getOperator(symbol: Char, numOfArguments: Int): Operator? {
        return when (symbol) {
            '+' -> {
                if (numOfArguments != 1) {
                    queue[OperatorUnit.ADDITION.index]
                }
                queue[OperatorUnit.UNARY_PLUS.index]
            }
            '-' -> {
                if (numOfArguments != 1) {
                    queue[OperatorUnit.SUBTRACTION.index]
                }
                queue[OperatorUnit.UNARY_MINUS.index]
            }
            '*' -> {
                queue[OperatorUnit.MULTIPLICATION.index]
            }
            '/' -> {
                queue[OperatorUnit.DIVISION.index]
            }
            '^' -> {
                queue[OperatorUnit.POWER.index]
            }
            '%' -> {
                queue[OperatorUnit.MODULO.index]
            }
            else -> null
        }
    }

}