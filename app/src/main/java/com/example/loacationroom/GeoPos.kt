package com.example.loacationroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "geo_pos")
data class GeoPos(
    val latitude:Float = 0f,
    val longitude: Float = 0f
){
    @PrimaryKey(autoGenerate = true)
    var _id:Int = 0
}
