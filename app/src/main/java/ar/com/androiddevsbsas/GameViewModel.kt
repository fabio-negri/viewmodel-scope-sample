package ar.com.androiddevsbsas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var oneScore = 0
    private var twoScore = 0
    private val _playerOneScore = MutableLiveData<Int>()
    private val _playerTwoScore = MutableLiveData<Int>()

    val playerOneScore: LiveData<Int> = _playerOneScore
    val playerTwoScore: LiveData<Int> = _playerTwoScore

    init {
        _playerOneScore.value = oneScore
        _playerTwoScore.value = twoScore
    }

    fun scorePlayerOne() {
        _playerOneScore.value = ++oneScore
    }

    fun scorePlayerTwo() {
        _playerTwoScore.value = ++twoScore
    }
}