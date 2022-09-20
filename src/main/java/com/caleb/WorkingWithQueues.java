package com.caleb;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek().toString());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
