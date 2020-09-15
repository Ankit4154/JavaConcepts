/* ############################# Thread Concept ########################### */
/* thread, inner class versus void run in class by extends thread
-- If InnerClass of thread is defined with the same name 
-- as of class Mythread extending Thread class
-- then Innerclass's run() method will be called
-- despite run() being defined in the user defined thread extending class
*/
class Mythread extends Thread {
    public void run() {
        System.out.println("Running in Mythread");
    }
    public void run(String s){
        System.out.println("Running string");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Mythread m1 = new Mythread(){
            public void run() {
                System.out.println("Running in main Mythread Anonymous Inner class");
            }
        };
        System.out.println("Before Thread in main");
        m1.start(); // Running in main Mythread Anonymous Inner class
    }
}