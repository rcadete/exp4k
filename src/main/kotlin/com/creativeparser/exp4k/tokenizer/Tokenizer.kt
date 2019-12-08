package com.creativeparser.exp4k.tokenizer

import com.creativeparser.exp4k.operator.Operator
import com.creativeparser.exp4k.function.Function

data class Tokenizer(private val expression: String,
                     private val functions: Map<String, Function>,
                     private val operators: Map<String, Operator>,
                     private val variables: Set<String>) {
}