package com.indie.promptpalette

import android.app.Application
import androidx.room.Room
import com.indie.promptpalette.data.AppDatabase

class PromptPaletteApplication : Application() {
    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "promptpalette.db"
        )
            // .fallbackToDestructiveMigration()    // optional, for dev
            .build()
    }
}
