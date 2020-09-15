/* If two classes extends the same class then it does not mean that 
the objects will refer to the same types.
There will occur incompatible types error while assigning one object reference to another
*/


class A {
    public void display() {
        System.out.println("Value is A");
    }
}
 class B extends A{
    public void display() {
        System.out.println("Value is B");
    }
}
 class C extends A {
    public void display() {
        System.out.println("Value is C");
    }
}

public class Test{
    public static void main(String args[]){
        B b = new B();
        C c = new C();
        b = c;  //Compilation Error C cannot be converted to B (incompatible types)
        newprint(b);
    }
    public static void newprint(A a){
        a.display();
    }
}