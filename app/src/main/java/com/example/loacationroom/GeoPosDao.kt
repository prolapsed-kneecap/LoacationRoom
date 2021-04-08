package com.example.loacationroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface GeoPosDao {
    @Query("SELECT * FROM geo_pos ")
    fun getLon(): List<GeoPos>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(geo_pos: GeoPos)

    @Query("DELETE FROM geo_pos")
    suspend fun deleteAll()
}