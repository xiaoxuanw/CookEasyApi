package com.example.cookeasyapi

data class Recipe (
    val id: Int,
    val includeNutrition:Boolean,
    val title: String,
    val image: String,
    val servings: Int,
    val readyInMinutes: Int,
    val sourceName: String,
    val healthScore: Int
)