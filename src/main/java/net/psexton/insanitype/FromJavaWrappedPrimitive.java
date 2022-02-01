/*
 * FromJavaObject.java, part of the Insanitype project
 * Created on Jan 31, 2022, 9:47:30 PM
 * Paul Sexton
 */

package net.psexton.insanitype;

/**
 * FromJavaWrappedPrimitive: Tests Java Object -> Matlab variable.
 * 
 * One method per primitive type, each with no arguments. Returns a variable of 
 * specified type.
 * 
 * @author PSexton
 */
public class FromJavaWrappedPrimitive {
    
    public static Byte getByte() {
        return 2;
    }
    
    public static Short getShort() {
        return 1729;
    }
    
    public static Integer getInt() {
        return 87539319;
    }
    
    public static Long getLong() {
        return 6963472309248L;
    }
    
    public static Float getFloat() {
        return 1.618f;
    }
    
    public static Double getDouble() {
        return 2.71828182845904523536;
    }
    
    public static Boolean getBoolean() {
        return true;
    }
    
    public static Character getChar() {
        return '*';
    }
}
