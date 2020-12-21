/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strath.fruitserviceclient;

import com.strath.fruitservice.constants.Constants;
import com.strath.fruitservice.interfaces.ComputeInterface;
import com.strath.fruitservice.interfaces.TaskInterface;
import com.strath.fruitservice.models.Fruit;
import com.strath.fruitservice.tasks.AddFruitPrice;
import com.strath.fruitservice.tasks.DeleteFruitPrice;
import com.strath.fruitservice.tasks.UpdateFruitPrice;
import java.net.MalformedURLException;
import static java.nio.file.Files.delete;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * 
 */
public class Init {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Registry registry = LocateRegistry.getRegistry(Constants.RMI_PORT); 
        ComputeInterface engine = (ComputeInterface)registry.lookup(Constants.RMI_ID); 
        Fruit fruit = new Fruit("Orange",20);       
        TaskInterface add = new AddFruitPrice();  
        TaskInterface edit = new UpdateFruitPrice(); 
        TaskInterface delete = new DeleteFruitPrice(); 
        engine.compute(add, fruit); 
        engine.compute(edit, fruit); 
        engine.compute(delete, fruit); 

    }
    
}