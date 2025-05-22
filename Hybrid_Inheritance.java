public class Hybrid_Inheritance {
    public static void main(String[] args) {
        shark f1 = new shark();
        f1.swim();
        f1.teeth();
        f1.eat();
    }
}

class Animal{
    String colour;
    void eat(){
        System.out.println("Eats....");
    }
}

class mammal extends Animal{
    void walks(){
        System.out.println("Walks....");
    }
}

class Dog extends mammal{
    void sound(){
        System.out.println("barks....");
    }
}

class cat extends mammal{
    void sound(){
        System.out.println("mewwww....");
    }
}

class human extends mammal{
    void sound(){
        System.out.println("talks....");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly....");
    }
}

class Peacock extends Bird{
    void dance(){
        System.out.println("Dance when rains....");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("swim....");
    }
}

class shark extends fish{
    void teeth(){
        System.out.println("big teeth...");
    }
}

class tuna extends fish{
    void light(){
        System.out.println("lights....");
    }
}
