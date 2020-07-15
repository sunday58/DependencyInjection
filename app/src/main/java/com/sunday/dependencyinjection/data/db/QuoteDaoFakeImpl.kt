package com.sunday.dependencyinjection.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sunday.dependencyinjection.data.module.Quote

class QuoteDaoFakeImpl : QuoteDao{

    private val quoteList = mutableListOf<Quote>()
    private val quotes  = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    override fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    override fun getQuote() = quotes as LiveData<List<Quote>>
}