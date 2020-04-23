package com.example.cookeasyapi.Data

data class Recipe (
    val id: Int,
    val title: String,
    val image: String,
    val servings: Int,
    val readyInMinutes: Int,
    val sourceName: String,
    val healthScore: Int
)