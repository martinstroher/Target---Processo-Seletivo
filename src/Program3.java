import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {
		List<Dia> listaDeDias = new ArrayList<Dia>();
		
		List<Double> listaDeFaturamentos = Arrays.asList(22174.1664, 24537.6698, 26139.6134, 0.0, 0.0,
				26742.6612,	0.0, 42889.2258, 46251.174,	11191.4722,	0.0, 0.0, 3847.4823, 373.7838,
				2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662,
				13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61);
		
		
		int i = 1;
		for (Double faturamento : listaDeFaturamentos) {
			listaDeDias.add(new Dia(i, faturamento));
			i++;
		}
		
		
		Double menorValor = 999999.0;
		Double maiorValor = 0.0;
		for (Dia dia : listaDeDias)
			if (dia.getFaturamento() < menorValor && dia.getFaturamento() != 0.0) {
				menorValor = dia.getFaturamento();
			}
		
		for (Dia dia : listaDeDias)
			if (dia.getFaturamento() > maiorValor) {
				maiorValor = dia.getFaturamento();
			}
		
		
		
		List<Dia> listaDeDiasUteis = listaDeDias.stream().filter(x -> x.getFaturamento() != 0.0).collect(Collectors.toList());
		double faturamentoTotal = listaDeDiasUteis.stream().map(x -> x.getFaturamento()).reduce(0.0, (x, y) -> x + y);
		double mediaMensal = faturamentoTotal/ listaDeDiasUteis.size();
		
		
		
		
		List<Dia> listaAltoFaturamento = listaDeDiasUteis.stream().filter(x -> x.getFaturamento() > mediaMensal).collect(Collectors.toList());
		System.out.println("====Dados do mês====");
		System.out.printf("Menor valor de faturamento ocorrido: R$: %.2f \n", menorValor);
		System.out.printf("Maior valor de faturamento ocorrido: R$: %.2f \n", maiorValor);
		System.out.printf("Média mensal (contando apenas dias úteis): R$: %.2f \n", mediaMensal);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + listaAltoFaturamento.size());
	}
	}


