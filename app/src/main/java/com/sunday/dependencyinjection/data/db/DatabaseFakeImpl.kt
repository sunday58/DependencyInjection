package com.sunday.dependencyinjection.data.db

class DatabaseFakeImpl  : Database{
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()

}