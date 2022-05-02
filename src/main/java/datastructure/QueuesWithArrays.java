package datastructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 02/05/2022
 Comment: 
 ***************************************************************/
public class QueuesWithArrays {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Sim", 33));
        linkedList.add(new Person("Mike" , 28));


        //More functionality but costly, since it has a point toward next and previos element
        //so, LinkedList is good but costly
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 22));
        supermarket.add(new Person("Melat", 28));
        supermarket.add(new Person("Dan", 32));
        supermarket.add(new Person("Ben", 25));

        System.out.println(supermarket.size());
        //peek() retrieve the last element
        System.out.println(supermarket.peek());
        //poll() removes the last element
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
