package com.javahelloword;

public class SwitchStatment {
    public static void main(String[] args) {
        var nilai = "";

        switch (nilai) {
            case "A":
                System.out.println("Kerja Bagus");
                break;
            case "B":
            case "C":
                System.out.println("Mantap");
                break;
            case "D":
                System.out.println("Belajar Lagi Kids");
                break;
            default:
                System.out.println("Goblokkk");
        }
    }

}
