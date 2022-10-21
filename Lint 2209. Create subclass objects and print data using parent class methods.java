// Father.java
public class Father {
    private String name = "Zhuge Liang";
    private int id = 1;

    public Father() {
    }

    public Father(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void introduction() {
        System.out.println("Hello, my name is " + name + ", my id is " + id +
            ".");
    }
}

// Son.java
public class Son extends Father {
    public Son(String name, int id) {
        super(name, id);
    }
}

// Main.java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Son son1 = new Son("Zhuge Liang", 1);
        son1.introduction();
        
        Son son2 = new Son("Zhuge Zhan", 2);
        son2.introduction();
    }
}
