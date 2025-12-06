abstract class Animal
{
    protected int legs;
    protected Animal(int legs)
    {
        this.legs=legs;
    }
    abstract void eat();
    void walk()
    {
        System.out.println("Animal can walk and he has "+legs+" Legs");
    }
}
class Spider extends Animal
{
    Spider(int legs)
    {
        super(8);
    }
    void walk()
    {
        System.out.println("Animal can walk and he has "+legs+" Legs");
    }
    void eat()
    {
        System.out.println("The spider is eating");
    }

}
interface Pet
{
    String getName();
    void setName(String name);
    void play();
}
class Cat extends Animal implements Pet
{
    String name;
    Cat(String name)
    {
        super(4);
        this.name=name;
    }
    Cat()
    {
        this("");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void play()
    {
        System.out.println("The cat is Playing");
    }
    void eat()
    {
        System.out.println("Cat is eating");
    }
    
}

class Fish extends Animal implements Pet
{
    String name;
    Fish(String name)
    {
        super(0);
        this.name=name;
    }

     void walk()
    {
        System.out.println("Fish cannot walk");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void play()
    {
        System.out.println("The Fish is Playing");
    }
    void eat()
    {
        System.out.println("Fish is eating");
    }

}
class MainQuize
{
    public static void main(String args[])
    {
        // GIVEN OBJECTS FROM QUESTION
        Fish d = new Fish("Jadu");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish("Nemo");
        Animal e = new Spider(8);
        Pet p = new Cat("Patty");

        System.out.println("===== Calling Methods in Each Object =====");
        d.walk();
        d.eat();
        d.play();
        System.out.println("Fish name: " + d.getName());

        c.walk();
        c.eat();
        c.play();
        System.out.println("Cat name: " + c.getName());
 
        a.walk();   // polymorphism: a is Animal but method from Fish runs
        a.eat();

        e.walk();   // polymorphism: e is Animal but method from Spider runs
        e.eat();

        p.play();   // p is Pet interface
        System.out.println("Pet name: " + p.getName());

        System.out.println("\n===== Casting Objects =====");

        // Casting Animal -> Fish
        Fish f1 = (Fish) a; 
        f1.play();

        // Casting Pet -> Cat
        Cat c2 = (Cat) p;
        c2.eat();

        System.out.println("\n===== Polymorphism =====");

        Animal poly1 = new Cat("Tommy");
        Animal poly2 = new Fish("Dory");

        poly1.walk();  // Cat's walk()
        poly2.walk();  // Fish's walk()

        poly1.eat();   // Cat eat()
        poly2.eat();   // Fish eat()

        System.out.println("\n===== Using super to Call Superclass Methods =====");

        System.out.println("Calling Animal walk() using super inside classes:");
        // We triggered these already, but here we show examples

        d.walk();  // uses overridden walk in Fish ("Fish cannot walk")
        c.walk();  // uses Animal walk() because Cat did not override it
        e.walk();  // Spider overrides walk()
    }
}
