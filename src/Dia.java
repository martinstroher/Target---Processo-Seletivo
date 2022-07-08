import java.util.Objects;

public class Dia {

	private Integer dia;
	private Double faturamento;
	
	public Dia(Integer dia, Double faturamento) {
		this.dia = dia;
		this.faturamento = faturamento;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(faturamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dia other = (Dia) obj;
		return Objects.equals(faturamento, other.faturamento);
	}

	@Override
	public String toString() {
		return "Dia [dia=" + dia + ", faturamento=" + faturamento + "]";
	}
	
	
	
	
}
