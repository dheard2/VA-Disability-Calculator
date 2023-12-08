package com.example.vadisabilitycalculator.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [DisabilityRatingItem::class],
    version = 1,
)
abstract class DisabilityItemDataBase : RoomDatabase() {
    abstract val dao: DisibilityRatingItemDao
}
