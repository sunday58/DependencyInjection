package com.sunday.dependencyinjection.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.sunday.dependencyinjection.R
import com.sunday.dependencyinjection.data.module.Quote
import kotlinx.android.synthetic.main.activity_quotes.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance
import java.lang.StringBuilder

class QuotesActivity : AppCompatActivity(), KodeinAware {


    override val kodein by closestKodein()
    private val viewModelFactory: QuotesViewModelFactory by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        initializeUi()
    }

    private fun initializeUi() {
        val viewModel = ViewModelProvider(this, viewModelFactory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuote().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })

        add_quote.setOnClickListener {
            val quote = Quote(editTest_quotes.text.toString(), editTest_author.text.toString())
            viewModel.addQuote(quote)
            editTest_quotes.setText("")
            editTest_author.setText("")
        }
    }

}