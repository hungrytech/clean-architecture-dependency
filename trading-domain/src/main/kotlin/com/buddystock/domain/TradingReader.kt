package com.buddystock.domain

interface TradingReader {

    fun findTradingById(id: Long): Trading
}
