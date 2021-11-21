package com.metanit;
import java.lang.*;
public class ball
{
    private String size;
    private String date_of_publish,colour,condition;
    public ball(String size,String date_of_publish,String colour,String condition)
    {
        this.size=size;
        this.date_of_publish=date_of_publish;
        this.colour=colour;
        this.condition=condition;
    }
    public ball()
    {
        date_of_publish="unknown";
        colour="unknown";
        condition="unknown";
        size="unknown";
    }
    public String getSize()
    {
        return this.size;
    }
    public String getPD()
    {
        return  this.date_of_publish;
    }
    public String getColour()
    {
        return this.colour;
    }
    public String getCondition()
    {
        return this.condition;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public void setPD(String date_of_publish)
    {
        this.date_of_publish=date_of_publish;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public void setCondition(String condition)
    {
        this.condition=condition;
    }
    public String toString()
    {
        return "INFO: Size: "+this.size+", Date of publish: "+this.date_of_publish+", Colour: "+this.colour+", Condition: "+this.condition;
    }
}

