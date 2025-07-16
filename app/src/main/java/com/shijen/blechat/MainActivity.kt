package com.shijen.blechat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shijen.blechat.ui.theme.BleChatTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BleChatTheme {
                val _bottomSheetState = rememberBottomSheetScaffoldState()
                val scope = rememberCoroutineScope()
                Scaffold(
                    topBar = {
                        TopAppBar(title = {
                            Text(
                                getString(R.string.app_name),
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
                        sheetPeekHeight = LocalConfiguration.current.screenHeightDp.dp*0.4f,
                        sheetContent = {
                            Column(
                                modifier = Modifier.padding(start = 10.dp, end = 10.dp).fillMaxWidth().height(height = LocalConfiguration.current.screenHeightDp.dp*0.3f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    getString(R.string.welcome_to_nearsay),
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
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BleChatTheme {
        Greeting("Android")
    }
}