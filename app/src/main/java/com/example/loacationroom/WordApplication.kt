package com.example.loacationroom

import android.app.Application
import android.content.Context
import androidx.room.Room

class WordsApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
    companion object{
        private lateinit var appContext : Context
            val database: WordRoomDatabase by lazy {
                val LOCK = Any()
                synchronized(LOCK) {
                    Room.databaseBuilder(
                        appContext,
                        WordRoomDatabase::class.java,
                        "database"
                    )
                        .build()
                }
            }
    }
}