package com.example.cookeasyapi.Network

import com.example.cookeasyapi.RecipeList
import retrofit2.Response
import retrofit2.http.*

interface RecipeInterface {
    //Search by parameters

    @GET("recipes/search?apiKey=6eaa5f8381a34866833a7a9d0fc1d599")

    suspend fun getRecipeBySearchQuery(@Query("query") query: String)
            : Response<RecipeList>
}