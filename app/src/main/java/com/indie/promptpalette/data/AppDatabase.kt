package com.indie.promptpalette.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Tag::class, Bucket::class],   // ← list your entities here
    version  = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    // later: abstract fun tagDao(): TagDao
    // later: abstract fun bucketDao(): BucketDao
}
