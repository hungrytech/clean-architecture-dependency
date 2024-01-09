package com.buddystock.infrastructure

import com.buddystock.infrastructure.entity.TradingEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TradingJpaRepository: JpaRepository<TradingEntity, Long> {
}
