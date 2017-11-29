package controller;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service.CSVReader;
import service.RadioService;

public class Index {
	
	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader();
		csvReader.lerArquivo();
		try {
			RadioService radioService = new RadioService();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("//localhost/rockstarradio", radioService);
			System.out.println("Radio rodando...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
