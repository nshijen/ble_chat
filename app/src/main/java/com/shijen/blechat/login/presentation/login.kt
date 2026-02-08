package com.shijen.blechat.login.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.shijen.blechat.core.DeviceDiscovery

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navigationController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text(modifier = Modifier.fillMaxSize(), text = "Login") })  },
        content = { innerPadding ->
            Column (modifier = Modifier.padding(innerPadding)){
                Column(modifier = Modifier.weight(1f)) {
                    Text("Login Screen Content1")
                    Text("Login Screen Content2")
                    Text("Login Screen Content3")
                    Text("Login Screen Content4")
                }
                Button(modifier = Modifier.fillMaxWidth().padding(26.dp), onClick = {
                    navigationController.navigate(DeviceDiscovery) {
                        popUpTo("login") { inclusive = true }
                    }
                }) {
                    Text("Click Me")
                }
            }
        },
        bottomBar =  {
            Text( modifier = Modifier.padding(16.dp), text = "Login Screen Bottom Bar")
        })
}
