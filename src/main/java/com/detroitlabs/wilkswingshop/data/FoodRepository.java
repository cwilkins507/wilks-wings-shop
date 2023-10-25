package com.detroitlabs.wilkswingshop.data;

import com.detroitlabs.wilkswingshop.model.Drink;
import com.detroitlabs.wilkswingshop.model.Food;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoodRepository {

    private static final List<Food> FOOD_LIST = Arrays.asList(
            new Food("Appetizer", "***Pickle Chips", 1, 7.99),
            new Food("Appetizer", "Nachos", 2, 11.99),
            new Food("Appetizer", "***Jalapeno Poppers", 4, 8.99),
            new Food("Appetizer", "Fries", 0, 3.99),
            new Food("Appetizer", "Veggie Tray", 0, 10.99),
            new Food("Salad", "House Salad", 0, 5.99),
            new Food("Salad", "Caesar Salad", 0,5.99),
            new Food("Salad", "***Southwest Smoked Chicken Salad", 0, 11.99),
            new Food("Wings", "Buffalo", 3, 13.99),
            new Food("Wings", "***World Famous Dry Rub", 1, 13.99),
            new Food("Wings", "Mild", 1, 12.99),
            new Food("Wings", "Garlic Parm", 1, 13.99),
            new Food("Wings", "Lemon Pepper", 2, 13.99),
            new Food("Wings", "Punch Yo Momma Hot", 5, 13.99),
            new Food("Dessert", "***Chocolate Chip Cookies", 0, 7.99)

    );

    public List<Food> showFood() {//refactoring opportunity to split by food category on website
        List<Food> foodList = new ArrayList<>();
        for (Food food:FOOD_LIST) {
            foodList.add(food);
        }
        return foodList;
    }

    public String getEntree(int i) {
        List<Food> foodList = new ArrayList<>();
        for (Food food:FOOD_LIST) {
            foodList.add(food);
        }
      return foodList.get(i).getName();
    }

}
