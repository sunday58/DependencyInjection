package com.sunday.dependencyinjection.ui.quotes

import androidx.lifecycle.ViewModel
import com.sunday.dependencyinjection.data.module.Quote
import com.sunday.dependencyinjection.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuote() = quoteRepository.getQuote()
}