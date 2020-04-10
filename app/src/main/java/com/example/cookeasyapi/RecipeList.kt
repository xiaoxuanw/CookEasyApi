package com.example.cookeasyapi

data class RecipeList (val data:List<Recipe>,
                        val total: Int, val next:String)
