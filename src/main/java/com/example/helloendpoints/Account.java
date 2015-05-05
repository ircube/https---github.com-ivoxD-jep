package com.example.helloendpoints;

import java.util.ArrayList;

/**
 * Created by Administrador on 27/04/2015.
 */
public class Account {
    public String name;
    public int counter;
    public ArrayList<String> elements;

    public Account(){
        this.name = "";
        this.counter = 0;
        this.elements = new ArrayList<String>();
    }
    public Account(String name){
        this.name = name;
        this.counter = 0;
        this.elements = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }
}
