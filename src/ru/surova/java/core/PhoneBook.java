package ru.surova.java.core;

import java.util.HashMap;
import java.util.HashSet;


public class PhoneBook {

    private HashMap<String, HashSet<String>> phonesByName = new HashMap<>();

    public void add (String name, String phone){
        if(!phonesByName.containsKey(name)){
            phonesByName.put(name, new HashSet<>());
        }
        phonesByName.get(name).add(phone);
    }

    public String[] get (String name){
        if(!phonesByName.containsKey(name)){
            return new String[0];
        }
        HashSet<String> phones = phonesByName.get(name);
        String[] phonesBuffer = new String[phones.size()];
        return phones.toArray(phonesBuffer);
    }
}
