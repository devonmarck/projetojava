package pooTurma;

public class Administrativo extends Senac  {
String emailCorporativo;
 String redeDominio;
public Administrativo() {
	System.out.println("Dados pessoais");
    
    }

   void marcarPonto() {
	   System.out.println ("ponto mercado no sistema!");
   }
   
   void imprimirHolerite() {
	System.out.println("Holerite impresso!");   
   
   }
   void abrirChamadoSuporte() {
	   System.out.println("Luiz, computador parou de funcionar!"); 
   
   }
   public void acessarSistema() {
	   if (redeDominio == "sp.senac.br") {
		   logar();
   }
	   
  
	   else {
		   System.out.println("login nao realizado, tente novamente " + nome);
	   }
	   
   }
   
}