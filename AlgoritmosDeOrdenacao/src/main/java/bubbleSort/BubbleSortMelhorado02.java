package bubbleSort;

import java.time.Instant;
import java.util.Scanner;

public class BubbleSortMelhorado02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x[] = new int[5];
		int n, i, aux, troca;
		for (i = 0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			x[i] = in.nextInt();
		}
		n = 1;
		troca = 1;
		while (n <= 5 && troca == 1) {
			troca = 0;
			for (i = 0; i <= 3; i++) {
				if (x[i] > x[i + 1]) {
					troca = 1;
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
			n = n + 1;
		}
		for (i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "° número: " + x[i]);
		}
		System.out.println(Instant.now().getEpochSecond());
	}
}
