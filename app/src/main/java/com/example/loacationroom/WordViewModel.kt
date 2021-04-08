package com.example.loacationroom

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository) : ViewModel() {

    val allLons: MutableLiveData<List<GeoPos>> = MutableLiveData()

    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(geoPos: GeoPos) {
        viewModelScope.launch(Dispatchers.IO){
            repository.insert(geoPos)
        }
    }

    fun get(){
        viewModelScope.launch(Dispatchers.IO) {
            allLons.postValue(repository.allLons)
        }
        }
}
