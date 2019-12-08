package com.creativeparser.exp4k.function

import com.creativeparser.exp4k.error.ErrorCode
import java.lang.IllegalArgumentException


/**
 * Class representing functions used in an expression
 */
abstract class Function(private val name: String?, private val numOfArguments: Int) {

    init {
        if (numOfArguments < 0){
            throw IllegalArgumentException(ErrorCode.FUNCTION_ILLEGAL_ARGUMENTS.formatDescription(name))
        }
        if (!isValid(name)){
            throw IllegalArgumentException(ErrorCode.FUNCTION_ILLEGAL_NAME.formatDescription(name))
        }
    }

    constructor(name: String) : this(name, 1)

    abstract fun apply(vararg args: Double)


    fun isValid(name: String?): Boolean {
        if (name == null){
            return false
        }
        return name.all {c ->
            ((Character.isLetter(c) || c == '_') || Character.isDigit(c))
        }
    }
}