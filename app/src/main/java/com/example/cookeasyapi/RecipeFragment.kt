package com.example.cookeasyapi

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.cookeasyapi.R
import com.example.cookeasyapi.Recipe
import com.example.cookeasyapi.ViewModel.RecipeViewModel
import kotlinx.android.synthetic.main.fragment_recipe.*

class RecipeFragment: Fragment() {

    //Instances to be initiated later
    lateinit var viewModel: RecipeViewModel
    lateinit var searchButton: SearchView
    lateinit var searchBox: EditText

    //array list that holds the recipe
    var recipeList:ArrayList<Recipe> = ArrayList()
    //oncreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //set initial variables
        searchBox = search_box
        searchButton = search_button
        viewModel = ViewModelProviders.of(this).get(RecipeViewModel::class.java)
        val activity: Activity? = activity
}
}