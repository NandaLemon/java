package com.javahelloword;

public class foreach {
    public static void main(String[] args) {
        String[] array = {
                "Eko", "Kurniawan", "Khannedy",
                "Programer", "Zaman", "Now"
        };
        for (var value : array) {
            System.out.println(value);
        }
    }

}
