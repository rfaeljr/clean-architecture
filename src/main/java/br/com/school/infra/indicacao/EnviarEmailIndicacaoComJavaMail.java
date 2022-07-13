package br.com.school.infra.indicacao;

import br.com.school.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.school.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
