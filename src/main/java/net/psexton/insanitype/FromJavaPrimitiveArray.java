/*
 * FromJavaPrimitive.java, part of the Insanitype project
 * Created on Oct 1, 2014, 11:23:50 AM
 * Paul Sexton
 */

package net.psexton.insanitype;

/**
 * FromJavaPrimitive: Tests Java array-of-primitives type -> Matlab variable.
 * 
 * One method per primitive type, each with no arguments. Returns an array of 
 * size 1 of the specified type.
 * 
 * @author PSexton
 */
public class FromJavaPrimitiveArray {
    
    public static byte[] getByte() {
        byte[] scalarArray = {2};
        return scalarArray;
    }
    
    public static short[] getShort() {
        short[] scalarArray = {1729};
        return scalarArray;
    }
    
    public static int[] getInt() {
        int[] scalarArray = {87539319};
        return scalarArray;
    }
    
    public static long[] getLong() {
        long[] scalarArray = {6963472309248L};
        return scalarArray;
    }
    
    public static float[] getFloat() {
        float[] scalarArray = {1.618f};
        return scalarArray;
    }
    
    public static double[] getDouble() {
        double[] scalarArray = {2.71828182845904523536};
        return scalarArray;
    }
    
    public static boolean[] getBoolean() {
        boolean[] scalarArray = {true};
        return scalarArray;
    }
    
    public static char[] getChar() {
        char[] scalarArray = {'*'};
        return scalarArray;
    }
}
