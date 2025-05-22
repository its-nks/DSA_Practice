class Shallow_Deep_copy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "ABC";
        s1.roll = 123;
        s1.password = 6576;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        s1.marks[1] = 23;
        Student s2 = new Student(s1);
        s2.password = 123;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s1.password);
        System.out.println(s2.password);
    }

}

class Student {
    String name;
    int roll;
    int password;
    int marks[];

    // SHALLOW COPY
    Student(Student s1) {
        marks = new int[3];
        this.marks = s1.marks;

    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called..........");
    }

    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

}