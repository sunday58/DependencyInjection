package com.sunday.dependencyinjection.data.repository

import androidx.lifecycle.LiveData
import com.sunday.dependencyinjection.data.db.QuoteDao
import com.sunday.dependencyinjection.data.module.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository{

    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuote() = quoteDao.getQuote()
}