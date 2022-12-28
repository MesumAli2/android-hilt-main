package com.example.android.hilt.di

import android.content.Context
import android.provider.DocumentsContract.Root
import androidx.room.Room
import com.example.android.hilt.data.AppDatabase
import com.example.android.hilt.data.LogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DataBaseModule {

    @Provides
    fun providerLogDao(database : AppDatabase) : LogDao{
        return database.logDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext : Context) : AppDatabase{
        return Room.databaseBuilder(appContext, AppDatabase::class.java,
            "logging.db"
            ).build()
    }
}