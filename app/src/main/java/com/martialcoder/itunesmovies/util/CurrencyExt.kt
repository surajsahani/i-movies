package com.martialcoder.itunesmovies.util


fun Double.toCurrency(code: String): String {
    return "$this $code"
}