/* Initialized objects of Derive/child class are instanceof that class
    as well as thier Base/parent class as they can acquire properties of parent class.
    but are no instance of their Derive/child class.
*/
class A {}
class B extends A {}
class C extends B {}
public class Test {
    public static void main(String args[]) {
        B o = new B();
     System.out.println((o instanceof A)); // true
     System.out.println((o instanceof C)); // false
     System.out.println((o instanceof B)); // true
    }
}