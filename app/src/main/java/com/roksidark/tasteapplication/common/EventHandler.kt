package com.roksidark.tasteapplication.common

interface EventHandler<E> {
    fun obtainEvent(event: E)
}