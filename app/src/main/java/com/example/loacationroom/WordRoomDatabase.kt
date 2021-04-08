package com.example.loacationroom

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GeoPos::class], version = 1, exportSchema = false)
abstract class WordRoomDatabase : RoomDatabase() {
    abstract fun geoPosDao(): GeoPosDao
}