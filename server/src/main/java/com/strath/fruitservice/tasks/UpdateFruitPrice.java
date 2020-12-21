/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strath.fruitservice.tasks;

import com.strath.fruitservice.constants.Constants;
import com.strath.fruitservice.interfaces.TaskInterface;
import com.strath.fruitservice.models.Fruit;
import java.io.Serializable;

/**
 *
 * 
 */
public class UpdateFruitPrice implements TaskInterface,Serializable  {

    @Override
    public void execute(Fruit fruit) {
        System.out.println("updating fruit price of " + fruit.toString());
    }

    @Override
    public String getTaskName() {
        return Constants.UPDATE;
    }

}
