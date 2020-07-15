package com.sunday.dependencyinjection.data.db

interface Database {
    val quoteDao: QuoteDao
}