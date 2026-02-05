package com.shijen.blechat.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shijen.blechat.home.MainApp
import kotlinx.serialization.Serializable



@Serializable
object Home

@Composable
fun AppNavigation(){
    val navigationController = rememberNavController()
    NavHost(navigationController, startDestination = Home) {
        composable<Home> { MainApp() }
    }
}
