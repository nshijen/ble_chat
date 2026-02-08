package com.shijen.blechat.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shijen.blechat.deviceDiscovery.DeviceDiscoveryScreen
import com.shijen.blechat.home.Home
import com.shijen.blechat.login.presentation.Login
import com.shijen.blechat.onboarding.OnboardingScreen
import kotlinx.serialization.Serializable

@Serializable
object OnboardingScreen
@Serializable
object DeviceDiscovery

@Serializable
object Login

@Serializable
object Home

@Composable
fun AppNavigation(){
    val navigationController = rememberNavController()
    NavHost(navigationController, startDestination = OnboardingScreen) {
        composable<OnboardingScreen> { OnboardingScreen(navigationController) }

        composable<Login> { Login(navigationController) }

        composable<DeviceDiscovery> { DeviceDiscoveryScreen(navigationController) }

        composable<Home> { Home(navigationController) }
    }
}
