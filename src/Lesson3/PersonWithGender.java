package Lesson3;

public class PersonWithGender {

    String firstName, secondName;
    int age;
    Gender gender;

    public PersonWithGender(String firstName, String secondName, int age, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        PersonWithGender P1= new PersonWithGender( "Ivan", "Ivanov", 15, Genger.Male);
        System.out.println(P1);
    }
}
