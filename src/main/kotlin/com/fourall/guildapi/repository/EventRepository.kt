package com.fourall.guildapi.repository

import com.fourall.guildapi.model.Event
import org.springframework.data.jpa.repository.JpaRepository

interface EventRepository : JpaRepository<Event, Int> {
    fun findByName(name: String) : Event
}