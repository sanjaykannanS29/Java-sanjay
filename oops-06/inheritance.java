class Dog {
    int no = 4;
    String eat = "eating";

    public void display() {
        System.out.println(no);
        System.out.println(eat);
    }
}

class Puppy extends Dog {
    boolean bark = true;
}


public class inheritance { 
    public static void main(String[] args) { 
        Dog obj = new Dog();
        obj.display();
        
        Puppy obj1 = new Puppy();
        System.out.println(obj1.bark);
    }
}

