package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for(int i = 1; i > 0; i++) {

            try {
                System.out.println("Введите строку");


                String s = sc.nextLine();
                String s2 = extractNumber(s);
                System.out.println(s2);

                if (s2.length() == 0) {
                    System.out.println("Цифр нет");
                    break;
                }
                if (s2.length() != 0) {
                    throw new StExeption("Строка содержит цифру", s2);
                }

            } catch (StExeption e) {
                System.out.println(e.text+" "+e.number);
            }


        }

    }


    public static String extractNumber(final String str) {

        if(str == null || str.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                found = true;
            } else if(found){
                break;
            }
        }

        return sb.toString();
    }
}
