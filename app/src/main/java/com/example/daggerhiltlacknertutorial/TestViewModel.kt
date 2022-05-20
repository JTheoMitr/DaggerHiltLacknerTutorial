package com.example.daggerhiltlacknertutorial

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String2") testString2: String
) : ViewModel() {

    init {
        Log.d("ViewModel", "Test String from View Model: $testString2")
    }
}