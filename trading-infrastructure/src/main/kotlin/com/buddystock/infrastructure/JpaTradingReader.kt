package com.buddystock.infrastructure

import com.buddystock.domain.Trading
import com.buddystock.domain.TradingReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class JpaTradingReader(
    private val tradingJpaRepository: TradingJpaRepository
): TradingReader {

    override fun findTradingById(id: Long): Trading {
        val tradingEntity = tradingJpaRepository.findByIdOrNull(id)
            ?: throw IllegalArgumentException("Trading not found")

        return tradingEntity.toDomain()
    }
}
