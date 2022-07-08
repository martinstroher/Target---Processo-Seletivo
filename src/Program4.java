
public class Program4 {

	public static void main(String[] args) {
	double faturamentoSP = 67836.43;
	double faturamentoRJ = 36678.66;
	double faturamentoMG = 29229.88;
	double faturamentoES = 27165.48;
	double faturamentoOutros = 19849.53;
	
	double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;
	
	System.out.println("Percentual de representação do total de faturamento mensal de cada estado:");
	percentualEstado("SP", faturamentoSP, faturamentoTotal);
	percentualEstado("RJ", faturamentoRJ, faturamentoTotal);
	percentualEstado("MG", faturamentoMG, faturamentoTotal);
	percentualEstado("ES", faturamentoES, faturamentoTotal);
	percentualEstado("Outros", faturamentoOutros, faturamentoTotal);
	
	}
	
	public static void percentualEstado(String estado, double faturamento, double faturamentoTotal) {
		double percentual = faturamento/faturamentoTotal *100;
		System.out.printf(estado + ": %.2f \n", percentual);
	}

}
