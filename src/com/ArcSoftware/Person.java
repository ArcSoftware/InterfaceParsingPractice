package com.ArcSoftware;

/**
 * Created by Jake on 4/11/17.
 */
public class Person implements Comparable{
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String country;
    public String ip;


    public Person(String id, String firstName, String lastName, String email, String country, String ip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " from " + country;
    }


    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return lastName.compareTo(p.lastName);
    }
}
