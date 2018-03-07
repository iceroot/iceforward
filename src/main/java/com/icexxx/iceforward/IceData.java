package com.icexxx.iceforward;

public class IceData {
    public static String data(String str) {
        if (str == null) {
            str = "";
        }
        return "text_" + str;
    }
}
