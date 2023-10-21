package com.example.pam5_128_c

import android.provider.ContactsContract.Intents.Insert
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pam5_128_c.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel () {
    var namausr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    private val _UiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _UiState.asStateFlow()

    fun InsertData(nm: String, tlp: String, jk:String) {
        namausr = nm;
        noTlp = tlp;
        jenisKl = jk;
    }
    fun setJenisK(pilihJK: String) {
        _UiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
}