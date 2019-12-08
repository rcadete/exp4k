package com.creativeparser.exp4k.tokenizer

/**
 * Class representing a number in the expression.
 */
data class NumberToken(private val value: Double) {

    constructor(expression: CharArray, offset: Int, len: Int) : this(String(expression,offset,len).toDouble())
}