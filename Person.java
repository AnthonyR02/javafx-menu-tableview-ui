package com.example.app;

public class Person {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String role;
    private final String email;

    public Person(int id, String firstName, String lastName, String role, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getRole() { return role; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nFirst: " + firstName +
                "\nLast: " + lastName +
                "\nRole: " + role +
                "\nEmail: " + email;
    }
}
