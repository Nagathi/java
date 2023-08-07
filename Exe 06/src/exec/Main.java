package exec;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		if(s.indexOf("ae") != -1) {
			System.out.println("Possui");
		}else{
			System.out.println("Não possui");
		}

	}

}
