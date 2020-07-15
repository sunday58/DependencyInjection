package com.sunday.dependencyinjection.data.repository

import androidx.lifecycle.LiveData
import com.sunday.dependencyinjection.data.module.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}