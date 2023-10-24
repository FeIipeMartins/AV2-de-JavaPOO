package q1_FelipeKunst;

public class Carro extends Veiculo{
	private String Transmissao;

	public String getTransmissao() {
		return Transmissao;
	}
	public void setTransmissao(String transmissao) {
		this.Transmissao = transmissao;	
	}
	  @Override
	  public String toString() {
	        return Transmissao;
	  }
	
	public static void main(String[]agrs) {
	 Companhia name = new Companhia();
	 name.setName("Porche");
	 Funcionario Funcionarios = new Funcionario();
	 Funcionarios.setFuncionario("Felipe Kunst");
	 Veiculo NumerodeRegistro = new Veiculo();
	 NumerodeRegistro.setNumerodeRegistro("123456789101");
	 Carro Transmissao=new Carro();
	 Transmissao.setTransmissao("Manual");
	 System.out.println("Nome da Companhia e " +  name);
	 System.out.println("Nome do Funcionario e " + Funcionarios);
	 System.out.println("Numero de Registro do Veiculo e " + NumerodeRegistro);
	 System.out.println("Tipo de Transmição do carro e "  + Transmissao);
	}
}
	