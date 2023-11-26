package org.example.package2;

import lombok.Getter;

public class
StringUtils {
    @Getter
    private String result;

    public void concatenate(String str1, String str2) {
        result = str1 + str2;
    }
}
