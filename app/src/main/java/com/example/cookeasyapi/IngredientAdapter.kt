package com.example.cookeasyapi

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cookeasyapi.Data.Ingredient
import com.example.cookeasyapi.Data.Recipe
import com.example.cookeasyapi.ViewModel.RecipeIngredientViewModel

class IngredientViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.ingredient_item, parent, false)) {
    private val ingredientNameView: TextView = itemView.findViewById(R.id.ingredient_Name)

    fun bind(ingredient: Ingredient) {
        ingredientNameView.text = ingredient.name
    }

    }

class IngredientAdapter(private val list: ArrayList<Ingredient>)
    : RecyclerView.Adapter<IngredientViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return IngredientViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        val ingredient: Ingredient = list[position]
        holder.bind(ingredient)
    }

    override fun getItemCount(): Int = list.size

}
