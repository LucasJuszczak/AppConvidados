package com.example.appconvidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.appconvidados.model.GuestModel
import com.example.appconvidados.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

    fun insert(guest: GuestModel) {
        repository.insert(guest)
    }

}