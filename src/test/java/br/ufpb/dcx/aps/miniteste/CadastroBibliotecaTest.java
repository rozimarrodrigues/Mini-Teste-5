package test.java.br.ufpb.dcx.aps.miniteste;

import static org.junit.Assert.assertEquals;
import main.java.br.ufpb.dcx.aps.miniteste.CadastroBiblioteca;
import main.java.br.ufpb.dcx.aps.miniteste.TipoCadastro;

import org.junit.Before;
import org.junit.Test;

public class CadastroBibliotecaTest {

	private CadastroBiblioteca cadastro;

	@Before
	public void criarCadastro(){
		this.cadastro = new CadastroBiblioteca();
	}

	@Test
	public void cadastraAlunoTest(){
		this.cadastro.cadastra(TipoCadastro.ALUNO,"Rozimar", "80921004");
		assertEquals("Nome: Rozimar\nMatricula: 80921004\nCategoria: Aluno", this.cadastro.getCadastro(0));
	}

	@Test
	public void cadastraProfessorTest(){
		this.cadastro.cadastra(TipoCadastro.PROFESSOR,"Rodrigo", "87931084");
		assertEquals("Nome: Rodrigo\nMatricula: 87931084\nCategoria: Professor", this.cadastro.getCadastro(0));
	}
}
