package com.roksidark.tasteapplication.ui.screen.login.model

enum class LoginSubState {
    SignIn, SignUp, Forgot
}

data class LoginViewState(
    val loginSubState: LoginSubState = LoginSubState.SignIn,
    val emailValue: String = "",
    val passwordValue: String = "",
    val fullNameValue: String = "",
    val rememberMeChecked: Boolean = false,
    val isLoginProgress: Boolean = false
)