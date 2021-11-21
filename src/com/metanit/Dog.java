package com.metanit;
import java.lang.*;

public class Dog
{
    private int age;
    private String name;

    public Dog(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public Dog(String name)
    {
        this.name=name;
        age=0;
    }

    public Dog()
    {
        name="puppy";
        age=0;
    }

    public void SetAge (int age)
    {
        this.age=age;
    }
    public void SetName (String name)
    {
        this.name = name;
    }
    public int GetAge ()
    {
        return this.age;
    }
    public String GetName ()
    {
        return this.name;
    }
    public String info ()
    {
        return this.name + "  "+ this.age;
    }
    public void Dog_into_Human ()
    {
        System.out.println(this.name + "\'s age is: "+ this.age+" "+ this.name + "\'s age into human age is: "+ this.age*7);
    }
}