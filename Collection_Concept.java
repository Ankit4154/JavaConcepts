/*
Set can have other Collections in constructor.
According to the Generic type specified for given Set
it will take those values even if they are passed as List object.
Thus it will store the Integer values from List as specific 
Integer values and do its process accordingly
*/
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        Set<Integer> s = new HashSet<>(Arrays.asList(1,1,2,2,3,3,4,5,6,7,7,8,9,0));
        System.out.println(s); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        for(Integer x : s)
            System.out.println(x);
            System.out.println(s.size()); // 10
    }
}