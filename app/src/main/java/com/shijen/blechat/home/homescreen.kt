package com.shijen.blechat.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.shijen.blechat.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(){
    val _bottomSheetState = rememberBottomSheetScaffoldState()
    rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    stringResource(R.string.app_name),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleLarge
                )
            })
        },
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->

        BottomSheetScaffold(
            containerColor = Color.Green,
            scaffoldState = _bottomSheetState,
            sheetPeekHeight = LocalConfiguration.current.screenHeightDp.dp * 0.4f,
            sheetContent = {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .fillMaxWidth()
                        .height(height = LocalConfiguration.current.screenHeightDp.dp * 0.3f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        stringResource(R.string.welcome_to_nearsay),
                        modifier = Modifier.padding(10.dp),
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            },
            sheetContainerColor = Color.Blue,
            sheetSwipeEnabled = false,
            sheetDragHandle = {},
            content = {
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .background(color = Color.Transparent),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "Icon",
                        Modifier.size(200.dp)
                    )
                }
            }
        )
    }
}