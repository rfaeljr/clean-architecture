package br.com.school.aplicacao.aluno.matricular;

import br.com.school.dominio.aluno.Aluno;
import br.com.school.dominio.aluno.CPF;
import br.com.school.dominio.aluno.Email;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(
				new CPF(cpfAluno), 
				nomeAluno, 
				new Email(emailAluno));
	}
	
}
