package com.home.mindsnap.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.home.mindsnap.usecase.GetUserFirstJoined

class MainViewModel(private val getUserFirstJoined: GetUserFirstJoined) : ViewModel() {

    private val firstJoinLiveData : LiveData<Boolean> = MutableLiveData(getUserFirstJoined.isFirstJoined())
    fun isFirstJoined() : LiveData<Boolean> {
        //이렇게 해야 매 rotation시 로드 안함
        return firstJoinLiveData
    }

}