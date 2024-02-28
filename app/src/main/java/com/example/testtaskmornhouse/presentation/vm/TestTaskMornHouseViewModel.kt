package com.example.testtaskmornhouse.presentation.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testtaskmornhouse.domain.GetTestTaskMornHouseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestTaskMornHouseViewModel @Inject constructor(
    private val getFactAboutNumberRepository: GetTestTaskMornHouseRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(ScreenValueState())
    val uiState: StateFlow<ScreenValueState> = _uiState.asStateFlow()

    fun onChangeNumber(number: String) {
        _uiState.update { currentState ->
            currentState.copy(
                inputNumber = number
            )
        }
    }

    suspend fun getFactAboutNumber(number: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val factAboutNumber = getFactAboutNumberRepository.getFactAboutNumber(number)
            _uiState.update { currentState ->
                currentState.copy(
                    listOfFacts = currentState.listOfFacts + factAboutNumber
                )
            }
        }
    }
}

data class ScreenValueState(
    val inputNumber: String = "",
    val listOfFacts: List<String> = listOf()
)
