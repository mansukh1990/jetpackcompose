package com.example.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.R
import com.example.loginflow.components.ButtonComponent
import com.example.loginflow.components.ClickableLoginTextComponent
import com.example.loginflow.components.DividerTextComponent
import com.example.loginflow.components.HeadingTextComponent
import com.example.loginflow.components.MyTextFiledComponent
import com.example.loginflow.components.NormalTextComponent
import com.example.loginflow.components.PasswordTextFiledComponent
import com.example.loginflow.components.UnderLinedTextComponent
import com.example.loginflow.navigation.PostOfficeAppRouter
import com.example.loginflow.navigation.Screen
import com.example.loginflow.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            NormalTextComponent(
                value = stringResource(id = R.string.hello)
            )
            HeadingTextComponent(
                value = stringResource(id = R.string.welcome_back)
            )
            MyTextFiledComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.outline_mail_outline_24)
            )
            PasswordTextFiledComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.baseline_lock_outline_24)
            )
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            UnderLinedTextComponent(
                value = stringResource(id = R.string.forgot_password)
            )
            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(
                value = stringResource(id = R.string.login)
            )
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)

            })

        }

    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
