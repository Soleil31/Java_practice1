package com.metanit;
import java.lang.*;

public class ballTest {
    public static void main(String[] args) {
        ball first = new ball("5", "12.12.2009", "white with black lines", "Factory new");
        ball second = new ball();
        second.setSize("4");
        second.setPD("30.11.2021");
        second.setColour("blue");
        second.setCondition("Field tested");
        System.out.println(second.getSize());
        System.out.println(second.getPD());
        System.out.println(second.getColour());
        System.out.println(second.getCondition());
        System.out.println(first);
        System.out.println(second);
    }
}

