package com.indie.promptpalette.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "buckets")
data class Bucket(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val isEnabled: Boolean = true
)
