/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strath.fruitservice.services;

import java.rmi.server.UnicastRemoteObject;
import com.strath.fruitservice.interfaces.ComputeInterface;
import com.strath.fruitservice.interfaces.TaskInterface;
import com.strath.fruitservice.models.Fruit;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author haamani
 */
public class FruitComputeEngine extends UnicastRemoteObject implements ComputeInterface {

    public FruitComputeEngine() throws RemoteException {
        super();
    }

    @Override
    public void compute(TaskInterface task, Fruit fruit) {
        task.execute(fruit);
    }

}
