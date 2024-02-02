package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
	//Objeto 1
		Administrativo funcionario1 = new Administrativo();
		funcionario1.nome = "carlos";
		funcionario1.emailCorporativo = "carlos@sp.Senac.br";
		funcionario1.acessarSistema();
		
		
      Administrativo funcionario2 = new Administrativo();
      funcionario2.nome = "Joelma";
      funcionario2.emailCorporativo = "Joelma";
      funcionario2.redeDominio = "@sesi.com.br";
      funcionario2.acessarSistema();
	}

}
