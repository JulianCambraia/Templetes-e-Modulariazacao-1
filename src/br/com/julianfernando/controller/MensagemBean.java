package br.com.julianfernando.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MensagemBean {
	
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
