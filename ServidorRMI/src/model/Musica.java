package model;

import java.io.Serializable;

public class Musica implements Serializable{
	
	private static final long serialVersionUID = 7502404069334266437L;
	
	private Integer id;
	private Integer idAlbum;
	private Integer numeroDaFaixa;
	private String nomeDaFaixa;
	private String letra;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdAlbum() {
		return idAlbum;
	}
	public void setIdAlbum(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}
	public Integer getNumeroDaFaixa() {
		return numeroDaFaixa;
	}
	public void setNumeroDaFaixa(Integer numeroDaFaixa) {
		this.numeroDaFaixa = numeroDaFaixa;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String getNomeDaFaixa() {
		return nomeDaFaixa;
	}
	public void setNomeDaFaixa(String nomeDaFaixa) {
		this.nomeDaFaixa = nomeDaFaixa;
	}

}
