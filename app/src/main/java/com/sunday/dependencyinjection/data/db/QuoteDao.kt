package com.sunday.dependencyinjection.data.db

import androidx.lifecycle.LiveData
import com.sunday.dependencyinjection.data.module.Quote

interface QuoteDao {

    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}