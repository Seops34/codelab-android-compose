/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codelab.basiclayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.component.SootheBottomNavigation
import com.codelab.basiclayouts.component.SootheNavigationRail
import com.codelab.basiclayouts.screen.HomeScreen
import com.codelab.basiclayouts.ui.theme.MySootheTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySootheTheme {
                val windowSizeClass = calculateWindowSizeClass(this)
                MySootheApp(windowSizeClass)
            }
        }
    }
}

@Composable
fun MySootheApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            MySootheAppPortrait()
        }
        WindowWidthSizeClass.Medium,
        WindowWidthSizeClass.Expanded -> {
            MySootheAppLandscape()
        }
    }
}

@Composable
fun MySootheAppPortrait() {
    Scaffold(
        bottomBar = { SootheBottomNavigation() }
    ) {
        HomeScreen(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
fun MySootheAppLandscape() {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Row {
            SootheNavigationRail()
            HomeScreen()
        }
    }
}


@Preview
@Composable
private fun PreviewMySoothAppProtrait() {
    MySootheTheme {
        MySootheAppPortrait()
    }
}

@Preview
@Composable
private fun PreviewMySootheAppLandscape() {
    MySootheTheme {
        MySootheAppLandscape()
    }
}


