package com.example.vadisabilitycalculator.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DisibilityRatingItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDisabilityRatingItem(item: DisabilityRatingItem)

    @Delete
    suspend fun deleteDisabilityRatingItem(item: DisabilityRatingItem)

    @Query("SELECT * FROM DisabilityRatingItem WHERE id = :id")
    suspend fun getDisabilityRatingItem(id: Int): DisabilityRatingItem?

    @Query("SELECT * FROM DisabilityRatingItem")
    fun getAllDisabilityItems(): Flow<List<DisabilityRatingItem>>
}
