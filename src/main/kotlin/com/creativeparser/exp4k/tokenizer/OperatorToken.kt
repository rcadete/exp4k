package com.creativeparser.exp4k.tokenizer

import com.creativeparser.exp4k.error.ErrorCode
import com.creativeparser.exp4k.operator.Operator
import java.lang.IllegalArgumentException

/**
 * Class representing an operator in the expression.
 */
data class OperatorToken(private val operator: Operator?) {
    init {
        if (operator == null) {
            throw IllegalArgumentException(ErrorCode.OPERATOR_UNKNOWN.description)
        }
    }
}