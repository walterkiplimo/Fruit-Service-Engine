/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strath.fruitservice.main;

import com.strath.fruitservice.interfaces.TasksInterface;
import com.strath.fruitservice.services.TasksComputeEngine;
import com.strath.fruitservice.tasks.TasksComputeTaskRegistry;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author haamani
 */
public class Init {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // TODO code application logic here
        TasksInterface engine = new TasksComputeEngine();
        TasksComputeTaskRegistry task = new TasksComputeTaskRegistry(engine);
        task.runTask();
    }
    
}
