package exec;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int num = 2;
		int resto;
		ArrayList pares = new ArrayList();
				
		for(int i = 0; i < 20; i++) {
			resto = num%2;
			
			if(resto == 0) {
				pares.add(num);
				num++;
			}else {
				num++;
			}
		}
		System.out.println(pares);
	}
}
