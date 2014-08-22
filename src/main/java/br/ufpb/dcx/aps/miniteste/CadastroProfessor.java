package main.java.br.ufpb.dcx.aps.miniteste;

public class CadastroProfessor implements Cadastro {

	@Override
	public String cadastra(String nome, String matricula) {
		String result = "";
		
		result += "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n"
				+ "Categoria: " + "Professor";
		
		return result;
	}

}
