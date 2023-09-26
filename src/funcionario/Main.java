package funcionario;

import funcionario.PraticaHeranca.*;

public class Main {
	public static void main(String[] args) {
      
        Gerente gerente = new Gerente("João Gerente", 8000.0, "joao123", "senha123");

        Telefonista telefonista = new Telefonista("Maria Telefonista", 3500.0, "Estação 1");
        
        Secretaria secretaria = new Secretaria("Ana Secretaria", 4000.0, "Ramal 101");

        System.out.println("Informações do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Login: " + gerente.getLogin());
        System.out.println("Senha: " + gerente.getSenha());
        System.out.println();

        System.out.println("Informações da Telefonista:");
        System.out.println("Nome: " + telefonista.getNome());
        System.out.println("Salário: " + telefonista.getSalario());
        System.out.println("Código da Estação: " + telefonista.getCodigoEstacao());
        System.out.println();

        System.out.println("Informações da Secretaria:");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Número do Ramal: " + secretaria.getNumeroRamal());
    }
}
