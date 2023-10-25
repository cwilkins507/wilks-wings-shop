package com.detroitlabs.wilkswingshop.data;

import com.detroitlabs.wilkswingshop.model.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodRepositoryTest {

    @Test
    void shouldReturnJalaPenoPoppers() {


        //arrange
        FoodRepository testFoodRepository = new FoodRepository();

        //Act
        String result = testFoodRepository.getEntree(2);

        //Assert
        assertEquals(result, "***Jalapeno Poppers");
    }
}