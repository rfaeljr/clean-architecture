package br.com.school.aplicacao.indicacao;

import br.com.school.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
