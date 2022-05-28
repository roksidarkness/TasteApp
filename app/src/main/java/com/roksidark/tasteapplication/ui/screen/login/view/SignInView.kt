package com.roksidark.tasteapplication.ui.screen.login.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.roksidark.tasteapplication.R
import com.roksidark.tasteapplication.ui.component.DTextField
import com.roksidark.tasteapplication.ui.screen.login.model.LoginViewState


@Composable
fun SignInView(
    viewState: LoginViewState,
    onTextFieldChange: (String) -> Unit
) {
    Column {
        DTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            value = viewState.emailValue,
            placeholder = stringResource(id = R.string.email_hint),
            onValueChange = onTextFieldChange
        )
    }
}