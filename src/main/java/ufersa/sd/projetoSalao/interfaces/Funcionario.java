package ufersa.sd.projetoSalao.interfaces;

public interface Funcionario {
	String cargo = null;
	public void setCargo(String cargo);
	
	public void cadastrarFuncionario();
	public void updateFuncionario();
	public void deletarFuncionario();
}
