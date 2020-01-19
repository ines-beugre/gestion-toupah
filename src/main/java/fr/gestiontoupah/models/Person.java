package fr.gestiontoupah.models;

import java.time.LocalDate;

public class Person {
     private String lastname;
     private String firstname;
     private LocalDate birthday;
     private String generation;
     private String description;
     private float amount;
     private boolean isLeader;

    public Person(String lastname, String firstname, LocalDate birthday, String generation, String description, float amount) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthday = birthday;
        this.generation = generation;
        this.description = description;
        this.amount = amount;
        this.isLeader = false;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday=" + birthday +
                ", generation='" + generation + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", isLeader=" + isLeader +
                '}';
    }
}
