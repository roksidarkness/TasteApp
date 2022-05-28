package com.roksidark.tasteapplication.ui.screens.login

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.roksidark.tasteapplication.R
import com.roksidark.tasteapplication.ui.theme.AppTheme

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel
) {
    LazyColumn(
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp)
    ) {
        item {
            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = "Login Screen"
            )
        }
    }
}