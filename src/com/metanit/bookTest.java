package com.metanit;
import java.lang.*;

public class bookTest
{
    public static void main (String[] args)
    {
        book first = new book("CHICKEN","Square","Factory new");
        book second = new book();
        second.setAuthor("GOAT");
        second.setShape("Circle");
        second.setCondition("Field tested");
        System.out.println(second.getAuthor());
        System.out.println(second.getShape());
        System.out.println(second.getCondition());
        System.out.println(first);
        System.out.println(second);

    }
}
