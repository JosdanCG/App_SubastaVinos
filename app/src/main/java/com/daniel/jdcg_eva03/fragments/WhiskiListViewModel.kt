package com.daniel.jdcg_eva03.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daniel.jdcg_eva03.data.retrofilt.repository.WhiskiRepository
import com.daniel.jdcg_eva03.data.retrofilt.response.ApiResponse
import com.daniel.jdcg_eva03.model.Whisky
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WhiskiListViewModel: ViewModel(){
    val repository: WhiskiRepository()
    val whiskiList: MutableLiveData<List<Whisky>> = MutableLiveData<List<Whisky>>()


    fun getWhiskiFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response= repository.getWhiski()
            when(response){
                is ApiResponse.Error->{

                }
                is ApiResponse.Success -> {
                    whiskiList.postValue(response.data.whiskis)
                }
            }
        }
    }
}