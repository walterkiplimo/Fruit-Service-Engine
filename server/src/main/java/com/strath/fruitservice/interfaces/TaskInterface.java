/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strath.fruitservice.interfaces;

import com.strath.fruitservice.models.Fruit;

/**
 *
 * @author haamani
 * @param <T>
 */
public interface TaskInterface<T> {
    
    public void execute(Fruit t);   
    
    public String getTaskName();
    
}
