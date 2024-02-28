package com.example.testtaskmornhouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.testtaskmornhouse.presentation.screens.FirstScreen
import com.example.testtaskmornhouse.presentation.vm.TestTaskMornHouseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel:TestTaskMornHouseViewModel by viewModels()
        setContent {
            FirstScreen(viewModel)
        }
    }
}
