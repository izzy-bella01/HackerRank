package ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

class Day9 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many contacts do you want to add?: ");
        int n = in.nextInt();

        HashMap<String, Integer> contacts = new HashMap<>();

        for(int i = 0; i < n; i++){
            System.out.println("Enter name and number: ");
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contacts.put(name, phone);
        }


        System.out.println("Which contact do you want to find: ");
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(contacts.containsKey(s)) {
                System.out.println(s + "=" + contacts.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
