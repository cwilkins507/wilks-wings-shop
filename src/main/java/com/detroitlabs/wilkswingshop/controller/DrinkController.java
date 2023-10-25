package com.detroitlabs.wilkswingshop.controller;

import com.detroitlabs.wilkswingshop.data.DrinkRepository;
import com.detroitlabs.wilkswingshop.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkController { //used to list drink menu items

    @Autowired
    private DrinkRepository drinkRepository;

    @RequestMapping("/drinkmenu")
    public String displayDrinkMenu(ModelMap modelMap) {

        List<Drink> drinkMenu = drinkRepository.showDrinks();
        modelMap.put("drinkmenu", drinkMenu);
        return "drinkmenu";
    }
}
