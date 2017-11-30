package principal;

import java.awt.List;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import interfaces.IRadioService;
import model.Album;

public class Index {

	private static IRadioService rockstarRadio;

	public static void main(String[] args) {
		try {
			rockstarRadio = (IRadioService) Naming.lookup("//localhost/rockstarradio");
			ouve(rockstarRadio.sintoniza());
			ArrayList<Album> albuns = (ArrayList<Album>) rockstarRadio.listaAlbuns("Kanye West");
			for (Album album : albuns) {
				System.out.println(album.getNomeDoAlbum());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void ouve(String mensagem) {
		System.out.println(mensagem);
	}
}
