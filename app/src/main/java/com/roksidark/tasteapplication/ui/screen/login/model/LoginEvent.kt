package com.roksidark.tasteapplication.ui.screen.login.model

sealed class LoginEvent {
    object ActionClicked : LoginEvent()
    data class EmailChanged(val value: String) : LoginEvent()
}