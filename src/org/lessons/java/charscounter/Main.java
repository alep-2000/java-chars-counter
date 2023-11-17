package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String strParola = in.nextLine();

        in.close();
        
        
        Map<Character, Integer> occorrenze = new HashMap<>();

        for (int i = 0; i < strParola.length(); i++) {
            char carattere = strParola.charAt(i);
            occorrenze.put(carattere, occorrenze.getOrDefault(carattere, 0) + 1);
        }

       
        System.out.println("Occorrenze dei caratteri nella parola:");
        for (Map.Entry<Character, Integer> entry : occorrenze.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
}
