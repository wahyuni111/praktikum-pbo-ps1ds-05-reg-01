package com.caca.guided;

public class Circle01 {
    public static final double PHI=3.14;

    public static double radiansToDegrees(double radians){
        return radians*180/PHI;
    }
    public double r;
    public double area(){
        return PHI*r*r;
    }
    public double circumference(){
        return 2*PHI*r;
    }
}

