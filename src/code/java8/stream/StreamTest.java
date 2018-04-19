package code.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * This is an sample class to show how to use Java Stream api
 * 
 * @author Aravindo Swain
 *
 */
public class StreamTest {

    public static void main(String[] args) {

        // Create list of Students
        List<Student> students = Arrays.asList(new Student(1, "Akshay", "Kumar", 65, Gender.MALE, 23),
                new Student(2, "Salman", "Khan", 55, Gender.MALE, 22),
                new Student(3, "Shahrukh", "Khan", 62, Gender.MALE, 24),
                new Student(4, "Sanjeev", "Kapoor", 52, Gender.MALE, 24),
                new Student(5, "Ranveer", "Kapoor", 75, Gender.MALE, 18),
                new Student(2, "Sana", "Khan", 55, Gender.FEMALE, 22),
                new Student(3, "Gauhar", "Khan", 62, Gender.FEMALE, 28),
                new Student(4, "Kareena", "Kapoor", 52, Gender.FEMALE, 24),
                new Student(5, "Sonam", "Kapoor", 75, Gender.FEMALE, 22),
                new Student(6, "Amir", "Khan", 62, Gender.MALE, 24),
                new Student(7, "Anil", "Kapoor", 65, Gender.MALE, 23),
                new Student(8, "Afzal", "Khan", 52, Gender.MALE, 25),
                new Student(9, "Ramesh", "Kumar", 65, Gender.MALE, 29));

        //Filter all the FEMALE students and print
        List<Student> femaleStudents = students.stream().filter(s -> s.getGender() == Gender.FEMALE)
                .collect(Collectors.toList());
        femaleStudents.forEach(femaleStudent -> System.out.println(femaleStudent));

        //Filter all the students whose age is less than 25 and print
        List<Student> youngStudents = students.stream().filter(s -> s.getAge() < 25)
                .collect(Collectors.toList());
        youngStudents.forEach(student -> System.out.println(student));
        
        //Filter all the MALE students whose last name is Kapoor
        List<Student> filteredStudents = students.stream().filter(s -> s.getGender() == Gender.MALE).filter(s -> s.getLastName().equals("Kapoor"))
                .collect(Collectors.toList());
        filteredStudents.forEach(student -> System.out.println(student));

        //Filter all the MALE students whose last name is 'Khan' and who got more than 60 marks and print
        List<Student> filteredStudents1 = students.stream().filter(s -> s.getGender() == Gender.MALE).filter(s -> s.getLastName().equals("Khan")).filter(s -> s.getMark() > 60)
                .collect(Collectors.toList());
        filteredStudents1.forEach(student -> System.out.println(student));
    }

}

/**
 * A simple Student class
 * 
 * @author Aravindo Swain
 * 
 */
class Student {
    private int roll;
    private String firstName;
    private String lastName;
    private int mark;
    private Gender gender;
    private int age;

    public Student(int roll, String firstName, String lastName, int mark, Gender gender, int age) {
        super();
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
        this.gender = gender;
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", firstName=" + firstName + ", lastName=" + lastName + ", mark=" + mark
                + ", gender=" + gender + ", age=" + age + "]";
    }

}

enum Gender {
    MALE, FEMALE;
}