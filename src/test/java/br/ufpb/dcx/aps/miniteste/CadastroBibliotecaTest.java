package test.java.br.ufpb.dcx.aps.miniteste;

import static org.junit.Assert.assertEquals;
import main.java.br.ufpb.dcx.aps.miniteste.CadastroAluno;
import main.java.br.ufpb.dcx.aps.miniteste.CadastroBiblioteca;
import main.java.br.ufpb.dcx.aps.miniteste.CadastroFuncionario;
import main.java.br.ufpb.dcx.aps.miniteste.CadastroProfessor;

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
		this.cadastro.cadastra(new CadastroAluno(),"Rozimar", "80921004");
		assertEquals("Nome: Rozimar\nMatricula: 80921004\nCategoria: Aluno", this.cadastro.getCadastro(0));
	}

	@Test
	public void cadastraProfessorTest(){
		this.cadastro.cadastra(new CadastroProfessor(),"Rodrigo", "87931084");
		assertEquals("Nome: Rodrigo\nMatricula: 87931084\nCategoria: Professor", this.cadastro.getCadastro(0));
	}
	
	@Test
	public void cadastraFuncionarioTest(){
		this.cadastro.cadastra(new CadastroFuncionario(),"João", "11521017");
		assertEquals("Nome: João\nMatricula: 11521017\nCategoria: Funcionario", this.cadastro.getCadastro(0));
	}
}
