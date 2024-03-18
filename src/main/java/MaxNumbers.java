import java.util.Scanner;

public class MaxNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Najgolem od n vcitani broevi!!");
		int n , x , max;
		
		System.out.println();
		
		System.out.println("kolku broevi ke proveruvas : ");
		n = input.nextInt();
		
		System.out.println("Vnesi 1 broj : ");
		x = input.nextInt();
		
		max = x;
		
		for (int i=2; i<=n; i++) {
			
			System.out.println("Vnesi" + i + ". broj." );
			x = input.nextInt();
			if (x > max)
				max = i;
			
			
		}
		
			System.out.println("Najgolem broj e  " + max );
		
		
		
		
		
		
		
		
		
	}

}
