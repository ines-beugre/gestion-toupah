package fr.gestiontoupah.models;

public class Group {
    private Person person;
    private int number;

    public Group(Person person, int number) {
        this.person = person;
        this.person.setLeader(true);
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Group{" +
                "person=" + person +
                ", number=" + number +
                '}';
    }
}
