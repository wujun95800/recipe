package com.jskj.util;

public class ValidateUtil {
    public static void validate(boolean flag,String msg){
        if(flag){
            throw new RuntimeException(msg);
        }

    }
}
