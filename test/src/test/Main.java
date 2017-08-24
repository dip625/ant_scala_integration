package test;

import com.scala.HelloWorldScala;
import math.MyMath;


public class Main {
    public static void main(String[] args) {
        MyMath math = new MyMath();
         HelloWorldScala.main(null);
        System.out.println("Result is: " + math.multi(5, 10));
    }
}