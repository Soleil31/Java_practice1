package com.metanit;
import java.lang.*;

public class DogTest
{
    public static void main (String[] args)
    {
        Dog first = new Dog("Choppa",3);
        Dog second = new Dog("Bigboy");
        Dog third = new Dog();
        third.SetName("Bullet");
        third.SetAge(2);
        //System.out.println(third.GetName());
        //System.out.println(third.GetAge());
        //System.out.println(third.info());
        first.Dog_into_Human();
        second.Dog_into_Human();
        third.Dog_into_Human();
    }
}
