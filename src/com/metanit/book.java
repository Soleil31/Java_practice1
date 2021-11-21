package com.metanit;
import java.lang.*;
public class book
{
    private String author,shape,condition;
    public book(String author,String shape,String condition)
    {
        this.author=author;
        this.shape=shape;
        this.condition=condition;//
    }
    public book()
    {
        author="unknown";
        shape="unknown";
        condition="unknown";
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getShape()
    {
        return  this.shape;
    }
    public String getCondition()
    {
        return this.condition;
    }


    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setShape(String shape)
    {
        this.shape=shape;
    }
    public void setCondition(String condition)
    {
        this.condition=condition;
    }

    public String toString()
    {
        return "INFO: Author: "+this.author+", Shape: "+this.shape+", Condition: "+this.condition;
    }
}

