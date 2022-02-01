/*
 * ToJavaPrimitive.java, part of the Insanitype project
 * Created on Jan 31, 2022, 9:49:33 PM
 */

package net.psexton.insanitype;

/**
 * ToJavaPrimitive: Tests Matlab variable -> Java Object.
 * 
 * One method, "receive", overloaded with a variety of parameter types.
 * All overloaded versions return a String 
 * @author PSexton
 */
public class ToJavaWrappedPrimitive {
    
    /**
     * byte: 8 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(Byte x) {
        return "Byte";
    }
    
    /**
     * short: 16 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(Short x) {
        return "Short";
    }
    
    /**
     * int: 32 bits, signed, two's complement.
     * (Possibly unsigned in Java 8 or later.)
     * @param x
     * @return 
     */
    public static String receive(Integer x) {
        return "Integer";
    }
    
    /**
     * long: 64 bits, signed, two's complement.
     * @param x
     * @return 
     */
    public static String receive(Long x) {
        return "Long";
    }
    
    /**
     * float: 32 bits, IEEE 754.
     * @param x
     * @return 
     */
    public static String receive(Float x) {
        return "Float";
    }
    
    /**
     * double: 64 bits, IEEE 754.
     * @param x
     * @return 
     */
    public static String receive(Double x) {
        return "Double";
    }
    
    /**
     * boolean: true or false. (Logically 1 bit, but implementation may vary.)
     * @param x
     * @return 
     */
    public static String receive(Boolean x) {
        return "Boolean";
    }
    
    /**
     * char: 16 bits, Unicode UTF-16 encoding.
     * @param x
     * @return 
     */
    public static String receive(Character x) {
        return "Character";
    }
}
