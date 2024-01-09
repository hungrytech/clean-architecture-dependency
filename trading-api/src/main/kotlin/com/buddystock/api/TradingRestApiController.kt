package com.buddystock.api

import com.buddystock.domain.TradingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/trading")
@RestController
class TradingRestApiController(
    private val tradingService: TradingService
) {

    @GetMapping("/{id}")
    fun findTradingById(@PathVariable id: Long) = tradingService.findTradingById(id)
}
