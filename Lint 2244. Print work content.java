// People.java
public abstract class People {
    public abstract void working();
}

// Police.java
public class Police extends People {
    @Override
    public void working() {
        System.out.println("The work of the police is to catch thieves.");
    }
}

// Chef.java
public class Chef extends People {
    public void working() {
        System.out.println("The work of the Chef is to cook.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // write your code here
        Police police = new Police();
        police.working();
        
        Chef chef = new Chef();
        chef.working();
    }
}
