package LgicaDeProgramaçao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "joão Roberto";
		int idade = 22;
		char sexo = 'M';

		System.out.println("__________________________________________.");

		if (sexo == 'M') {

			if (idade < 18) {

				System.out.println("Voce não tem idade necessaria.");

			}

			else {
				System.out.println("Alistamento obrigatório");
			}

		}
		
		

		else {

			System.out.println("Alistamento negado.");
		}

	}

}
