// Student.java
public class Student {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Solution.java
public class Solution {
    public void print(String name, int age) {
        Student student = new Student();
        student.age = age;
        student.setName(name);
        
        System.out.println(student.getName());
        System.out.println(student.age);
    }
}
