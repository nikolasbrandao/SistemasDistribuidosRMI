package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	private static final String LOCALARQUIVOCSV = "util/restaurantes_bares_2017.csv";
	private static final String DELIMITADOR = ";";
	
	private BufferedReader br;
	private String linha;
	
	public CSVReader() {
		this.br = null;
		this.linha = "";
	}
	
	public ArrayList<String[]> lerArquivo(){
		ArrayList<String[]> linhas = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(LOCALARQUIVOCSV));
			while((this.linha = br.readLine()) != null ){
				String [] infos = this.linha.split(DELIMITADOR);
				linhas.add(infos);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			System.out.println(e);
		} catch (IOException e) {
			System.out.println("ERRO DE INPUT OUTPUT");
			System.out.println(e);
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return linhas;
	}

}
