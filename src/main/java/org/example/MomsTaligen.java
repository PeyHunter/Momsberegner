package org.example;
import java.util.*;

public class MomsTaligen {

    private int moms;
    private int subTotal;
    private int total;




    public MomsTaligen(){}

    public int moms(int m)
    {
        moms = m;
        return (int) (m * 0.20);
    }

    public String toString()
    {
        return "moms toSting";
    }

    public int subtotalAfTotal(int s)
    {
        subTotal = s;
        return (int) (s / 1.25);
    }
}
