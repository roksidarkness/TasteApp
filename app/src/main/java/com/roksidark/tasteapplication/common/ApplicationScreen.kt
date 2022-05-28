package com.roksidark.tasteapplication.common

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.roksidark.tasteapplication.navigation.NavigationTree
import com.roksidark.tasteapplication.ui.screens.login.LoginScreen
import com.roksidark.tasteapplication.ui.screens.login.LoginViewModel
import com.roksidark.tasteapplication.ui.screens.splash.SplashScreen


@Composable
fun ApplicationScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationTree.Splash.name) {
        composable(NavigationTree.Splash.name) { SplashScreen(navController) }
        composable(NavigationTree.Login.name) {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginScreen(loginViewModel = loginViewModel)
        }
    }
}