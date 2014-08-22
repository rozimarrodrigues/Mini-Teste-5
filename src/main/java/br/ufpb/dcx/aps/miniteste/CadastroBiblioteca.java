package main.java.br.ufpb.dcx.aps.miniteste;

import java.util.ArrayList;
import java.util.List;

public class CadastroBiblioteca {

	private List<String> dados;

	public CadastroBiblioteca() {
		this.dados = new ArrayList<String>();
	}

	public void preencherCadastro(String info) {
		this.dados.add(info);
	}

	public void cadastra(TipoCadastro tipo, String nome, String matricula) {
		String result = "";

		switch (tipo) {
		case ALUNO:
			result += "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n"
					+ "Categoria: " + "Aluno";
			break;
		case PROFESSOR:
			result += "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n"
					+ "Categoria: " + "Professor";
			break;
		}
		this.dados.add(result);
	}

	public String getCadastro(int pos) {
		return this.dados.get(pos);
	}
}