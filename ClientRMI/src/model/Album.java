package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable{
	
	private static final long serialVersionUID = 224804283566327494L;
	
	private Integer id;
	private String nomeDoAlbum;
	private String nomeDoCantor;
	private ArrayList<Musica> faixas;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeDoAlbum() {
		return nomeDoAlbum;
	}
	public void setNomeDoAlbum(String nomeDoAlbum) {
		this.nomeDoAlbum = nomeDoAlbum;
	}
	public String getNomeDoCantor() {
		return nomeDoCantor;
	}
	public void setNomeDoCantor(String nomeDoCantor) {
		this.nomeDoCantor = nomeDoCantor;
	}
	public ArrayList<Musica> getFaixas() {
		return faixas;
	}
	public void setFaixas(ArrayList<Musica> faixas) {
		this.faixas = faixas;
	}
	
}
