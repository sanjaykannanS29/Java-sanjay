// Renamed to PascalCase (Animal instead of inheritance makes more sense contextually)
class Animal {
    int no = 4;
    String eat = "eating";

    public void display() {
        System.out.println(no);
        System.out.println(eat);
    }
}

// Dog inherits everything from Animal
class Dog extends Animal {
    boolean bark = true;
}

class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog();
        
        // 1. Access Dog's own unique property
        System.out.println("Does it bark? " + myDog.bark);
        
        // 2. Access properties inherited from Animal!
        System.out.println("Inherited 'eat' string: " + myDog.eat); 
        
        // 3. Call the inherited method
        System.out.println("Calling inherited display() method:");
        myDog.display(); 
    }
}
