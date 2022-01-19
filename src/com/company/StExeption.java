package com.company;

public class StExeption extends Exception {

    String number;
    String text;

    public StExeption(String text, String number){
        this.text = text;
        this.number = number;

}
}
