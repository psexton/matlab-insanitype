/*
 * FromJavaPrimitive.java, part of the Insanitype project
 * Created on Oct 1, 2014, 11:23:50 AM
 * Paul Sexton
 */

package net.psexton.insanitype;

/**
 * FromJavaPrimitive: Tests Java primitive type -> Matlab variable.
 * 
 * One method per primitive type, each with no arguments. Returns a variable of 
 * specified type.
 * 
 * @author PSexton
 */
public class FromJavaPrimitive {
    
    public static byte getByte() {
        return 2;
    }
    
    public static short getShort() {
        return 1729;
    }
    
    public static int getInt() {
        return 87539319;
    }
    
    public static long getLong() {
        return 6963472309248L;
    }
    
    public static float getFloat() {
        return 1.618f;
    }
    
    public static double getDouble() {
        return 2.71828182845904523536;
    }
    
    public static boolean getBoolean() {
        return true;
    }
    
    public static char getChar() {
        return '*';
    }
}
