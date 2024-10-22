package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    // The integer is the studentID, and we will be using the studentID because it
    // is unique
    private Map<Integer, Student> students;
    private Map<String, Set<Integer>> coursesStudents;

    public Maps() {
        // You can NOT use the students map without initializing it!
        students = new HashMap<>();
        // The HashMap is great when you have two things that should be associated
        // together. It provides a fast and easy way to access data

        coursesStudents = new TreeMap<>();
    }

    // Setters/Mutators
    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
    }

    public void registerStudentToCourse(String courseName, int studentID) {
        // The first time a student is added, the course will not be registered yet,
        // thus, it will have no associated value, therefore, we need to create the
        // value which in this case should be a HashSet

        // The second time a student is registered, the course will have an associated
        // value, thus, we do not need to create a new HashSet, we can use the existing
        // one
        Set<Integer> studentsID = coursesStudents.getOrDefault(courseName, new HashSet<>());

        // Make sure the student exists
        if (doesStudentExist(studentID)) {
            // Student does not exists, therefore, do not register them
            return;
        }

        // Add the student ID to the HashSet
        studentsID.add(studentID);

        // Add the HashSet back to the HashTable, this is not needed I did it to make
        // things easier for you to understand
        coursesStudents.put(courseName, studentsID);
    }

    public boolean doesStudentExist(int studentID) {
        return students.get(studentID) == null;
    }

    public void displayCourseData(String courseName) {
        // We need to get the course data if it exists
        Set<Integer> courseRegisteredStudents = coursesStudents.getOrDefault(courseName, null);

        if (courseRegisteredStudents == null) {
            // This course does not exist
            System.out.println("The course(" + courseName + ") has not been registered yet!");
            return;
        }

        // The course exists
        System.out.println(courseName);
        String separator = "";
        for (Integer studentID : courseRegisteredStudents) {
            students.get(studentID).display();
            System.out.println(separator);
            separator = "==============\n";
        }

    }

    public class Student {
        private static int studentsCount = 0;
        private String name;
        private int age;
        private int studentID;

        public Student(String name, int age) {
            this.name = name;
            if (age <= 0)
                age = 1;
            this.age = age;
            studentID = ++studentsCount;
        }

        // Getters/Accessors
        public String getName() {
            // Return the name with the first letter of each word capitalized
            // i.e. pErSON NAME becomes Person Name
            String[] personName = name.split(" ");
            StringBuilder capName = new StringBuilder();

            for (int i = 0; i < personName.length; i++) {
                capName.append(String.valueOf(personName[i].charAt(0)).toUpperCase()
                        + personName[i].toLowerCase().substring(1));

                if (i < personName.length - 1) {
                    // We want to separate the words with one space, but the last word should not
                    // have a space following it
                    capName.append(" ");
                }
            }

            return capName.toString();
        }

        public int getAge() {
            return age;
        }

        public int getStudentID() {
            return studentID;
        }

        // Setters/Mutators
        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Other methods
        public void display() {
            System.out.println("Student");
            System.out.println(" -> Name: " + getName());
            System.out.println(" -> Age: " + getAge());
            System.out.println(" -> StudentID: " + getStudentID());
        }

    }
}
