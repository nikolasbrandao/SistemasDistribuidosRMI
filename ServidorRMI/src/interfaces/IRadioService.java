package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

import model.Album;

public interface IRadioService extends Remote {
	
	public void tocaMusica(Integer codigoDaMusica, Album album) throws RemoteException;
	public Album recuperaAlbum(String nomeDoAlbum) throws RemoteException;
	public Collection<Album> listaAlbuns(String cantor) throws RemoteException;
	public String sintoniza();
}
