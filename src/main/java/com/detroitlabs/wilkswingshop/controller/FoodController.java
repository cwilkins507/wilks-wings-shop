package com.detroitlabs.wilkswingshop.controller;

import com.detroitlabs.wilkswingshop.data.FoodRepository;
import com.detroitlabs.wilkswingshop.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }

    @RequestMapping("/contactus")
    public String displayContact() {
        return "contactus";
    }

    @RequestMapping("/reservations")
    public String takeReservation() {
        return "reservations";
    }


    @RequestMapping("/foodmenu")
    public String displayFoodMenu(ModelMap modelMap) {

        List<Food> foodMenu = foodRepository.showFood();
        modelMap.put("foodmenu", foodMenu);
        return "foodmenu";

    }
}
