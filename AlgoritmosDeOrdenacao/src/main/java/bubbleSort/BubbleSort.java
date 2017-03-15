package bubbleSort;

import java.time.Instant;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x[] = new int[5];
		int n, i, aux;
		for (i = 0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			x[i] = in.nextInt();
		}
		for (n = 1; n <= 5; n++) {
			for (i = 0; i <= 3; i++) {
				if (x[i] > x[i + 1]) {
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
		}
		for (i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "° número: " + x[i]);
		}
		System.out.println(Instant.now().getEpochSecond());
	}
}
