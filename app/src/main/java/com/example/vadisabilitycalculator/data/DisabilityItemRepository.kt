package com.example.vadisabilitycalculator.data

import kotlinx.coroutines.flow.Flow

interface DisabilityItemRepository {

    suspend fun insertDisabilityRatingItem(item: DisabilityRatingItem)

    suspend fun deleteDisabilityRatingItem(item: DisabilityRatingItem)

    suspend fun getDisabilityRatingItem(id: Int): DisabilityRatingItem?

    fun getAllDisabilityItems(): Flow<List<DisabilityRatingItem>>
}
