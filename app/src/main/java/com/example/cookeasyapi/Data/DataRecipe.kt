package com.example.cookeasyapi.Data

data class DataRecipe(
    val results:List<Recipe>,
    val totalResults:Int,
    val next: String
)