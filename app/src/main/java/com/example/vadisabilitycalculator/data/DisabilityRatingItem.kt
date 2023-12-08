package com.example.vadisabilitycalculator.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DisabilityRatingItem(
    val title: String,
    val description: String?,
    val rating: Int,
    @PrimaryKey val id: Int? = null,
)
