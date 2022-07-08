import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Entre o n�mero que deseja verificar se consta na sequ�ncia de Fibonacci: ");
		Scanner sc = new Scanner(System.in);
		Long numero = (long) sc.nextInt();

		Stream<Long> streamFibonacci = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] })
				.map(p -> p[0]);
		
		List<Long> listaFibonacci = streamFibonacci.limit(100).collect(Collectors.toList());
		
		
		if (listaFibonacci.contains(numero)) {
			System.out.println("Esse n�mero est� contido na sequ�ncia de Fibonacci.");
		} else {
			System.out.println("Esse n�mero n�o consta na sequ�ncia de Fibonacci.");
		}
	}

}
