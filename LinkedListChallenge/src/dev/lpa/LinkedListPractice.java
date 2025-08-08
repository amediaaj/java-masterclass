package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListPractice {

    public static void DemoLinkedList() {
        LinkedList<Place> places = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(places, adelaide);
        addPlace(places, new Place("adelaide", 1374));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));
        places.addFirst(new Place("Sydney", 0));

        Scanner scanner = new Scanner(System.in);
        ListIterator<Place>listIterator = places.listIterator();
        char input;
        boolean forward = true;

       do {
           displayMenu();
           input = scanner.nextLine().toUpperCase().charAt(0);

           switch(input) {
               case 'F' -> {
                   if(listIterator.hasNext()) {
                       Place next = listIterator.next();
                       if(forward == false && listIterator.hasNext()) {
                           next = listIterator.next();
                       }
                       forward = true;
                       System.out.println(String.format("%s %d", next.name(), next.distance()));
                   }
               }
               case 'B' -> {
                   if(listIterator.hasPrevious()) {
                       Place previous = listIterator.previous();
                       if(forward == true && listIterator.hasPrevious()) {
                           previous = listIterator.previous();
                       }
                       forward = false;
                       System.out.println(String.format("%s %d", previous.name(), previous.distance()));
                   }
               }
               case 'L' -> {
                   System.out.println(places);
               }
               case 'M' -> {
                   displayMenu();
               }
               default -> {

               }
           }


       } while(input != 'Q');

    }

    public static void displayMenu() {
        System.out.println("Available actions (select word or letter):");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

    public static void addPlace(LinkedList<Place> linkedList, Place place) {
        ListIterator<Place> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            Place next = listIterator.next();
            if (next.name().equalsIgnoreCase(place.name())) {
                System.out.println("Duplicate...");
                return;
            }

            if(place.distance() < next.distance()){
                listIterator.previous();
                listIterator.add(place);
                listIterator.next();
                return;
            }
        }

        linkedList.add(place);
    }
}
