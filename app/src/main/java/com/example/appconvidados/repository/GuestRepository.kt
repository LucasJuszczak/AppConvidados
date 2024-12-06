package com.example.appconvidados.repository

import android.content.ContentValues
import android.content.Context
import com.example.appconvidados.constants.DataBaseConstants
import com.example.appconvidados.model.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!Companion::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel): Boolean {

        try{
            val db = guestDataBase.writableDatabase

            val presence = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put(DataBaseConstants.GUEST.COLUMNS.PRESENCE)
            values.put("name", guest.name)

            db.insert("Guest", null, values)

        } catch (e: Exception) {
            return false
        }
    }

    fun update(){

    }

}