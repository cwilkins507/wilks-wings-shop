package com.detroitlabs.wilkswingshop.data;

import com.detroitlabs.wilkswingshop.model.Drink;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DrinkRepository {

    private static final List<Drink> DRINK_LIST = Arrays.asList(
            new Drink("Wine", "House Red", 6),
            new Drink("Wine", "House White", 6),
            new Drink("Beer", "Lager", 3.50),
            new Drink("Beer", "IPA", 5.50),
            new Drink("Beer", "Red Ale", 4.50),
            new Drink("Soda", "Root Beer", 1.99),
            new Drink("Soda", "Coke", 1.99),
            new Drink("Soda", "Tea", 1.99),
            new Drink("Soda", "Lemonade", 1.99),
            new Drink("Water", "Water", 0)


    );

    public List<Drink> showDrinks() {
        List<Drink> drinkList = new ArrayList<>();
        for(Drink drink:DRINK_LIST) {
            drinkList.add(drink);
        } return drinkList;
    }
}
