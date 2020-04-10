package com.example.cookeasyapi.Network

import com.example.cookeasyapi.RecipeList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeInterface {
    public val  recipeID: Int
    //Search by parameters
    @GET("recipes/search")
    suspend fun getRecipeBySearchQuery(@Query("q") query: String)
            : Response<RecipeList>
}