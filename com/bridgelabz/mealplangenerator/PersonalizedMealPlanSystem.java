package com.bridgelabz.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class PersonalizedMealPlanSystem {
    public static void main(String[] args) {
        List<Meal<?>> mealPlans = new ArrayList<>();

        // Generating different meal plans
        Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMeal("Grilled Veggies with Rice", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMeal("Tofu Stir Fry", new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMeal("Keto Chicken Salad", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generateMeal("Grilled Chicken with Quinoa", new HighProteinMeal());

        mealPlans.add(vegMeal);
        mealPlans.add(veganMeal);
        mealPlans.add(ketoMeal);
        mealPlans.add(proteinMeal);

        // Displaying meal plans
        System.out.println("\nPersonalized Meal Plans:");
        for (Meal<?> meal : mealPlans) {
            System.out.println(meal);
        }
    }
}
