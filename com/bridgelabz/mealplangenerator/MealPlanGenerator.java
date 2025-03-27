package com.bridgelabz.mealplangenerator;
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMeal(String mealName, T mealType) {
        System.out.println("Generating meal plan: " + mealType.getMealType());
        return new Meal<>(mealName, mealType);
    }
}