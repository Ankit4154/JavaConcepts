import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class Lambda{

	public static void main(String args[]) {
		//default alphabetical sort
		//Set<String> set = new TreeSet<>();
		// Using anoymous class for Comparator interface(a functional interface)
		/* Set<String> set = new TreeSet<>(new Comparator<String>(){
			public int compare(String s1, String s2){
				return s1.length() - s2.length();
			}
		});
		*/
		// Using lambda, option 1
		/* Set<String> set = new TreeSet<>(
			(String s1, String s2) -> {return s1.length()- s2.length();});
		*/
		// Using lambda, option 2
		Set<String> set = new TreeSet<>((s1 , s2) -> s1.length() - s2.length());
		String s1 = "abc";
		String s2 = "zx";
		String s3 = "y";
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set);
	}

}