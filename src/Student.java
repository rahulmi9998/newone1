import java.lang.*;
import java.util.*;

class Student {
    String name;
    int marks;
    int age;

    public Student( String name, int marks,int age) {
        this.name = name;
        this.marks = marks;
        this.age=age;

    }

    public String toString() {

        // Returning attributes of Student
        return this.name + " " + this.marks + " " + this.age;
    }
}

class Sortbyage implements Comparator<Student> {
    public int compare(Student a, Student b) {

        return a.age - b.age;
    }
}

class Sortbyname implements Comparator<Student> {

    public int compare(Student a, Student b) {

        return a.name.compareTo(b.name);
    }
}
class SortbyMarks implements Comparator<Student>{
    public int compare(Student a, Student b) {

        return a.marks - b.marks;
    }
}

class GFG {

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student( "Mayank", 99,21));
        ar.add(new Student( "Anshul", 43,24));
        ar.add(new Student( "Solanki", 24,29));
        ar.add(new Student("Aggarwal", 100,31));

        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyage());

        // Display message on console for better readability
        System.out.println("\nSorted by age");

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar,new SortbyMarks());
        System.out.println("\n sort by marks");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}

