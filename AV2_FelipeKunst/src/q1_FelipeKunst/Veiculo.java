package q1_FelipeKunst;

public class Veiculo{
	private String NumerodeRegistro;

	public String getNumerodeRegistro() {
		return NumerodeRegistro;
	}

	public void setNumerodeRegistro(String numerodeRegistro) {
		this.NumerodeRegistro = numerodeRegistro;
	}
	  @Override
	  public String toString() {
	        return NumerodeRegistro;
	  }
}