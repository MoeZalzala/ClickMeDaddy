package com.example.retrofit2

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit2.model.JokeResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    private val repository = JokeRepository()

    val joke = MutableLiveData<State<JokeResponse?>>()

    init {
        getRandomJoke()
    }

    @SuppressLint("CheckResult")
    fun getRandomJoke() {
        viewModelScope.launch {
            repository.getRandomJoke().collect {
                joke.postValue(it)

            }
        }
    }
}