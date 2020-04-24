package com.example.cookeasyapi.Network

import com.example.cookeasyapi.Data.DataIngredients
import com.example.cookeasyapi.Data.DataRecipe
import retrofit2.Response
import retrofit2.http.*

interface RecipeInterface {
    //Search by parameters

    @GET("recipes/search?apiKey=6eaa5f8381a34866833a7a9d0fc1d599")

    suspend fun getRecipeBySearchQuery(@Query("query") query: String)
            : Response<DataRecipe>

    @GET("recipes/?apiKey=6eaa5f8381a34866833a7a9d0fc1d599")
    suspend fun getIngredientsByID(@Query("id") id: Int)
        : Response<DataIngredients>
}