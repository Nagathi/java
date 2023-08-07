package exec;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		
		for(int i = 0; i < s.length; i++) {
			System.out.print("Digite os valores pro array: ");
			String val = sc.next();
			s[i] = val;
		}
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
