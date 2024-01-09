package com.buddystock.infrastructure.entity

import com.buddystock.domain.Trading
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class TradingEntity(
    @Id
    val id: Long? = null,

    val name: String
) {

    fun toDomain() = Trading(
        id = id,
        name = name
    )
}
