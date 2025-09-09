package org.example.theory.hashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> translate = new HashMap<String, String>();

        // add elements
        translate.put("Meet up" , "Reunirse");
        translate.put("Dizzy" , "Mareado");
        translate.put("Go on" , "Continuar");
        translate.put("Work out" , "Ejercitarse");

        // get element
        String value = translate.get("Meet up");
        System.out.println(value);

        // remove element
        translate.remove("Dizzy");
        System.out.println(translate);

        // check if contains
        boolean contains = translate.containsKey("Meet up");
        System.out.println(contains);
        System.out.println(translate.containsKey("Dizzy"));

        // check if contains a certain value
        boolean containsValue = translate.containsValue("Reunirse");
        System.out.println(containsValue);
        System.out.println(translate.containsValue("Mareado"));



        // iterate over the map
        System.out.println("\nValues:");
        for(String values : translate.values()){
            System.out.println(values.toUpperCase());
        }

        System.out.println("\nKeys:");
        for (String key : translate.keySet()) {
            System.out.println(key.toUpperCase());
        }

        System.out.println("\nKeys and values:");
        for(HashMap.Entry<String, String> entry : translate.entrySet()){ // entrySet
            System.out.println(entry.getKey().toUpperCase() + " : " + entry.getValue().toUpperCase());
        }


        // clear the map
        translate.clear();
        System.out.println(translate);


    }
}
