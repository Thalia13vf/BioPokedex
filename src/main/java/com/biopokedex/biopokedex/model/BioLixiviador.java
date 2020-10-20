package com.biopokedex.biopokedex.model;

public class BioLixiviador {
	private Integer id;
	private String nome;
	private String tipo;
	private String filo;
	private String ordem;
	private String familia;
	private String info;
	private String imagem;

	public BioLixiviador() {

	}
	
	public BioLixiviador(Integer id, String nome, String tipo, String filo, String ordem, String familia, String info,
			String imagem) {
		
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.filo = filo;
		this.ordem = ordem;
		this.familia = familia;
		this.info = info;
		this.imagem = imagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
}
