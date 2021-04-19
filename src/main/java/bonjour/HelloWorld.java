package bonjour;

//import java.lang.System;
//import java.lang.*;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class HelloWorld {
  public static void main(String [] args) {
//    java.lang.System.out.println("Hello world!");
//    System.out.println("Hello world!");
    out.println("Hello world!");
    int x = 99;
    out.println(x + 10);
    out.println("Value of x is " + x);

    long lng = 3_000_000_000L;
    long  x2 = lng + x;
    out.println(x2);

    var count = 1; // "inferencing" Java 10 onwards
//    count = 123L; // NO, still strongly, statically, typed

    // arithmetic operators + - * / "remainder" %
    // comparison operators < <= > >= == !=
    // logical && (and) || (or) -- short-circuiting ! (not)
    // bitwise & | ~

    int a = 10;
    int b = 10;
    out.println("a == b? " + (a == b));

    String s1 = "Hello";
    String s2 = "He";
//    s2 = s2 + "llo";
    /*s2 = */s2.concat("llo");
    out.println(s2);
    out.println("s1 == s2? " + (s1 == s2));
    out.println("s1.equals(s2)? " + s1.equals(s2));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    out.println("sb1 " + sb1);
    out.println("sb2 " + sb2);
    out.println("sb1 == sb2? " + (sb1 == sb2));
    out.println("sb1.equals(sb2)? " + sb1.equals(sb2));
  }
}
