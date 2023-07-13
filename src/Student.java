import java.lang.*;
import java.util.*;

class Student {
    String name;
    int marks;
    int age;

    public Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;

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

class SortbyMarks implements Comparator<Student> {
    public int compare(Student a, Student b) {

        return a.marks - b.marks;
    }
}

class GFG {

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student("Mayank", 99, 21));
        ar.add(new Student("Anshul", 43, 24));
        ar.add(new Student("Solanki", 24, 29));
        ar.add(new Student("Aggarwal", 100, 31));

        Scanner s = new Scanner(System.in);
        System.out.println("if you want to sort based of name press: 1");
        System.out.println("if you want to sort based on marks press: 2");
        System.out.println("if you want to sort based on age press: 3");
        int x = s.nextInt();

        switch (x) {
            case 1:

                Collections.sort(ar, new Sortbyname());
                System.out.println("\nSorted by name");
                for (int i = 0; i < ar.size(); i++)
                    System.out.println(ar.get(i));

                break;
            case 2:
                Collections.sort(ar, new SortbyMarks());
                System.out.println("\n sort by marks");
                for (int i = 0; i < ar.size(); i++) {
                    System.out.println(ar.get(i));
                }
                break;
            case 3:
                Collections.sort(ar, new Sortbyage());

                System.out.println("\nSorted by age");

                for (int i = 0; i < ar.size(); i++)
                    System.out.println(ar.get(i));
                break;
            default:
                System.out.println("choose the right number");

        }
    }
}
//System.out.println("if you want output in ascending order press: 1");
//        System.out.println("if you want output in deasceding order press: 2");
//

