package ru.surova.java.core;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //ex.1

        System.out.println("Ex 1");

        String[] words = {"Milk", "Milk", "Meat", "Bread", "Bread", "Fruit", "Juice", "Fruit",
                "Milk", "Fish", "Fruit", "Fruit", "Chocolate", "Water"};

        HashMap<String, Integer> amountByName = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(amountByName.containsKey(word)){
                amountByName.put(word, amountByName.get(word)+1);
            }else {
                amountByName.put(word, 1);
            }
        }

        System.out.println(amountByName);
        System.out.println();

        //ex.2
        System.out.println("Ex 2");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "2");
        phoneBook.add("Petrov", "3");
        phoneBook.add("Sidorov", "1");
        phoneBook.add("Ivanov", "9");

        String[] names = {"Ivanov", "Petrov", "Vasin", "Sidorov"};
        for(int i = 0; i <names.length; i++) {
            String name = names[i];
            String[] phones = phoneBook.get(name);
            System.out.print(name + ":");
            for(int j = 0; j < phones.length; j++){
                System.out.print(" " + phones[j]);
            }
            System.out.println();
        }

    }



}
