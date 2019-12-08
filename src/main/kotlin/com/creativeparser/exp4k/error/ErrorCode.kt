package com.creativeparser.exp4k.error

enum class ErrorCode(val code: Int, val description: String) {
    FUNCTION_ILLEGAL_NAME(100, "The function name '%' is invalid"),
    FUNCTION_ILLEGAL_ARGUMENTS(102, "The number of function arguments can not be less than 0 for '%s'"),

    DIVISION_BY_ZERO(200, "Division by zero"),

    OPERATOR_UNKNOWN(300, "Operator unknown for token");



    fun formatDescription(vararg args: Any?): String {
        return  String.format(description,args)
    }
}