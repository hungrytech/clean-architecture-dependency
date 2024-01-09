package com.buddystock.domain

import org.springframework.stereotype.Service

@Service
class TradingService(
    private val tradingReader: TradingReader
) {

    fun findTradingById(id: Long): Trading = tradingReader.findTradingById(id)
}
