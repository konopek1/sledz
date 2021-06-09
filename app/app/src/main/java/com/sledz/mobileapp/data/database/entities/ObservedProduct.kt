package com.sledz.mobileapp.data.database.entities

import androidx.room.*

@Entity
data class ObservedProduct (
    @PrimaryKey
    val observedProductId: Long,

    val name: String,

    val description: String,

    val categoryName: String,

    val valueHistory: List<Price>,

    val weeklyStats: List<Statistics>,

    val monthlyStats: List<Statistics>,

    val globalStats: List<Statistics>,
)

