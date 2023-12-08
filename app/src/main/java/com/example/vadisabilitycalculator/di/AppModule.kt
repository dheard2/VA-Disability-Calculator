package com.example.vadisabilitycalculator.di

import android.app.Application
import androidx.room.Room
import com.example.vadisabilitycalculator.data.DisabilityItemDataBase
import com.example.vadisabilitycalculator.data.DisabilityItemRepository
import com.example.vadisabilitycalculator.data.DisabilityItemRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDisabilityItemDatabase(app: Application): DisabilityItemDataBase {
        return Room.databaseBuilder(
            app,
            DisabilityItemDataBase::class.java,
            "disability_db",
        ).build()
    }

    @Provides
    @Singleton
    fun provideDisabilityItemsRepository(db: DisabilityItemDataBase): DisabilityItemRepository {
        return DisabilityItemRepositoryImpl(db.dao)
    }
}
