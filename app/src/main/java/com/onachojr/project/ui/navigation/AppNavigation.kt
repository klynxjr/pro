package com.onachojr.project.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.onachojr.project.ui.screens.authentication.login.LoginScreen
import com.onachojr.project.ui.screens.onboarding.OnboardingScreen


@Composable
fun AppNavigation() {
    fun AppNavigation(navController: NavHostController, modifier: Modifier) {
        NavHost(
            navController = navController,
            startDestination = ROUTES.onboarding.name
        ) {
            composable(ROUTES.onboarding.name) { onboardingScreen(navController) }
            composable(ROUTES.login.name) { loginScreen(navController, modifier) }
            composable(ROUTES.forgotpassword.name) { forgotpasswordScreen(navController, modifier) }
            composable(ROUTES.signUp.name) { signUpScreen(navController, modifier) }


        }

    }
}