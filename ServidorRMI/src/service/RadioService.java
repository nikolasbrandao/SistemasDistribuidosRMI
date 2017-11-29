package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;

import interfaces.IRadioService;
import model.Album;

public class RadioService extends UnicastRemoteObject implements IRadioService{

	private static final long serialVersionUID = -3624822619991525478L;
	
	public RadioService() throws RemoteException {
		super();
	}

	@Override
	public void tocaMusica(Integer codigoDaMusica, Album album) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Toca Musica");
	}

	@Override
	public Album recuperaAlbum(String nomeDoAlbum) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Album> listaAlbuns(String cantor) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
