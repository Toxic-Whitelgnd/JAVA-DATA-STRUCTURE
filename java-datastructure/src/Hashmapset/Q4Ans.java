package Hashmapset;

import java.util.*;

public class Q4Ans {

    public static String getStart (HashMap<String,String> tick){
        HashMap<String,String> revtick = new HashMap<String,String>();

        for(String key : tick.keySet()){
            revtick.put(tick.get(key),key);
        }

        // for getting the start comparing the ticket and reversed ticket
        for(String key : tick.keySet()){
            if(revtick.containsKey(key) == false){
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<String,String>();
        tickets.put("Chennai",  "Bengaluru");
        tickets.put("Mumbai",  "Delhi");
        tickets.put("Goa",  "Chennai");
        tickets.put("Delhi",  "Goa");

        String start = getStart(tickets );
        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }
}
