package com.example.vadisabilitycalculator.data

import kotlinx.coroutines.flow.Flow

class DisabilityItemRepositoryImpl(
    private val dao: DisibilityRatingItemDao,
) : DisabilityItemRepository {
    override suspend fun insertDisabilityRatingItem(item: DisabilityRatingItem) {
        dao.insertDisabilityRatingItem(item)
    }

    override suspend fun deleteDisabilityRatingItem(item: DisabilityRatingItem) {
        dao.deleteDisabilityRatingItem(item)
    }

    override suspend fun getDisabilityRatingItem(id: Int): DisabilityRatingItem? {
        return dao.getDisabilityRatingItem(id)
    }

    override fun getAllDisabilityItems(): Flow<List<DisabilityRatingItem>> {
        return dao.getAllDisabilityItems()
    }
}
