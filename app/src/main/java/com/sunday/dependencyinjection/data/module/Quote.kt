package com.sunday.dependencyinjection.data.module

data class Quote(val text: String, val author: String) {

    override fun toString(): String {
        return "$text - $author"
    }
}