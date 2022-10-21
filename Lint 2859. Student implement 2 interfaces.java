// Interface1.java
public interface Interface1 {
    public String print1();
}

// Interface2.java
public interface Interface2 {
    public String print2();
}

// Student.java
public class Student implements Interface1, Interface2 {
    String s1 = "Student implements Interface1";
    String s2 = "Student implements Interface2";

    public String print1() {
       return this.s1;
    }    
    
    public String print2() {
       return this.s2;
    }    
}
