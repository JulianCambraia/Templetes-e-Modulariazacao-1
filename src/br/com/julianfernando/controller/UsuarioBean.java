package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.julianfernando.usuario.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean {
	
    private Usuario usuario = new Usuario();
    
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    
	private Map<String, String> sexos = new LinkedHashMap<String, String>();
	
	private boolean exibeMsgListaVazia = false; 
	
	public UsuarioBean() {
		super();
		sexos.put("Masculino","M");
		sexos.put("Feminino","F");
		sexos.put("Gay","G");
		sexos.put("Lésbica","L");
	}

	
	public Map<String, String> getSexos() {
		return sexos;
	}

	public void setSexos(Map<String, String> sexos) {
		this.sexos = sexos;
	}

	public void reset() {
		
	}

	public boolean isExibeMsgListaVazia() {
		return exibeMsgListaVazia;
	}

	public void setExibeMsgListaVazia(boolean exibeMsgListaVazia) {
		this.exibeMsgListaVazia = exibeMsgListaVazia;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void gravar() {
		this.usuarios.add(this.usuario);
		this.usuario = new Usuario();
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
