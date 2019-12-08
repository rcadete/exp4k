package com.creativeparser.exp4k.operator

/**
 * Class representing operators used in an expression
 */
abstract class Operator(private val symbol: String,
                        private val numOfOperands: Int,
                        private val leftAssociative: Boolean,
                        private val unit: OperatorUnit) {

    private val ALLOWED_OPERATOR_CHARS = arrayOf('+', '-', '*', '/', '%', '^', '!', '#', ':', '~', '<', '>', '|', '=', '÷')


    fun isAllowedOperator(char: Char): Boolean{
        return ALLOWED_OPERATOR_CHARS.contains(char)
    }

    fun isLeftAssociative(): Boolean {
        return leftAssociative
    }

    /**
     * Returns the calculated result of the operation applied on the the given operands
     */
    abstract fun apply(vararg args: Double): Double

}
