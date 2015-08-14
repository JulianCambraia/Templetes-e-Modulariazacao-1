package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.models.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = null;
	
	private List<Livro> livros = new ArrayList<Livro>();
	
	private List<Livro> livrosMaisVendidos = new ArrayList<Livro>();
	
	private List<Livro> livrosMaisCaros = new ArrayList<Livro>();

	public LivroBean() {
		super();
		Livro livro_1 = new Livro();
		livro_1.setAutor("Autor 1");
		livro_1.setTitulo("Titulo A");
		livro_1.setEditora("Editora X");
		livro_1.setPreco(129.51);
		
		Livro livro_2 = new Livro();
		livro_2.setAutor("Autor 2");
		livro_2.setTitulo("Titulo B");
		livro_2.setEditora("Editora Y");
		livro_2.setPreco(149.52);
		
		Livro livro_3 = new Livro();
		livro_3.setAutor("Autor 3");
		livro_3.setTitulo("Titulo C");
		livro_3.setEditora("Editora Z");
		livro_3.setPreco(199.03);
		
		Livro livro_4 = new Livro();
		livro_4.setAutor("Autor 4");
		livro_4.setTitulo("Titulo D");
		livro_4.setEditora("Editora W");
		livro_4.setPreco(229.54);
		
		// livros diversos
		this.livros.add(livro_1);
		this.livros.add(livro_2);
		this.livros.add(livro_3);
		this.livros.add(livro_4);
		
		// livros mais vendidos
		this.livrosMaisVendidos.add(livro_1);
		this.livrosMaisVendidos.add(livro_3);
		
		// livros mais caros
		this.livrosMaisCaros.add(livro_2);
		this.livrosMaisCaros.add(livro_4);
		
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivrosMaisVendidos() {
		return livrosMaisVendidos;
	}

	public List<Livro> getLivrosMaisCaros() {
		return livrosMaisCaros;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
}
