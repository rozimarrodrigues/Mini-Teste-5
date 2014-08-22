package main.java.br.ufpb.dcx.aps.miniteste;

import java.util.ArrayList;
import java.util.List;

public class CadastroBiblioteca {

	private List<String> dados = new ArrayList<String>();

	public void cadastra(Cadastro cadastro, String nome, String matricula) {	
		dados.add(cadastro.cadastra(nome, matricula));
	}

	public String getCadastro(int pos) {
		return dados.get(pos);
	}
}