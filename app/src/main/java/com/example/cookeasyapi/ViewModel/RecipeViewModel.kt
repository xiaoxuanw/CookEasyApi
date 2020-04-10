package com.example.cookeasyapi.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cookeasyapi.Network.RecipeRepository
import com.example.cookeasyapi.RecipeList

class RecipeViewModel (application: Application): AndroidViewModel(application){
    var recipeList: MutableLiveData<RecipeList> = MutableLiveData()
     var recipeRepository:RecipeRepository = RecipeRepository()

    //Request to search for recipe
    fun getRecipe(param:String){
        recipeRepository.getRecipeBySearch(recipeList,param)
    }

}