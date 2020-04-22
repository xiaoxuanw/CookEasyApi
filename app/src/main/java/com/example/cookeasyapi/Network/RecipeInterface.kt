package com.example.cookeasyapi.Network

import com.example.cookeasyapi.RecipeList
import retrofit2.Response
import retrofit2.http.*

interface RecipeInterface {
    //Search by parameters

    @GET("recipes/search")

    suspend fun getRecipeBySearchQuery(@Query("query") query: String)
            : Response<RecipeList>
}