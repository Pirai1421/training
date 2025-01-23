package Staticmethod;
class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent");
    }

    void instanceMethod() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child");
    }

    @Override
    void instanceMethod() {
        System.out.println("Instance method in Child");
    }
}
public class StaticInheritance {



        public static void main(String[] args) {
            Parent p = new Child();
            p.staticMethod(); // Calls Parent's static method
            p.instanceMethod(); // Calls Child's instance method

            Child c = new Child();
            c.staticMethod(); // Calls Child's static method
            c.instanceMethod(); // Calls Child's instance method

        }
}
