/*
 * ToJavaPrimitive.java, part of the Insanitype project
 * Created on Oct 1, 2014, 11:23:42 AM
 */

package net.psexton.insanitype;

/**
 * ToJavaPrimitive: Tests Matlab variable -> Java primitive type.
 * 
 * One method, "receive", overloaded with a variety of parameter types.
 * All overloaded versions return a String 
 * @author PSexton
 */
public class ToJavaPrimitive {
    
    /**
     * byte: 8 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(byte x) {
        return "byte";
    }
    
    /**
     * short: 16 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(short x) {
        return "short";
    }
    
    /**
     * int: 32 bits, signed, two's complement.
     * (Possibly unsigned in Java 8 or later.)
     * @param x
     * @return 
     */
    public static String receive(int x) {
        return "int";
    }
    
    /**
     * long: 64 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(long x) {
        return "long";
    }
    
    /**
     * float: 32 bits, IEEE 754.
     * @param x
     * @return 
     */
    public static String receive(float x) {
        return "float";
    }
    
    /**
     * double: 64 bits, IEEE 754.
     * @param x
     * @return 
     */
    public static String receive(double x) {
        return "double";
    }
    
    /**
     * boolean: true or false. (Logically 1 bit, but implementation may vary.)
     * @param x
     * @return 
     */
    public static String receive(boolean x) {
        return "boolean";
    }
    
    /**
     * char: 16 bits, Unicode UTF-16 encoding.
     * @param x
     * @return 
     */
    public static String receive(char x) {
        return "char";
    }
}
