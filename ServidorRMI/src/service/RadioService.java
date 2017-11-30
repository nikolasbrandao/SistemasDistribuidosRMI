package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;

import dao.AlbumDAO;
import dao.MusicaDAO;
import interfaces.IRadioService;
import model.Album;
import model.Musica;

public class RadioService extends UnicastRemoteObject implements IRadioService{

	private static final long serialVersionUID = -3624822619991525478L;
	
	public RadioService() throws RemoteException {
		super();
	}

	@Override
	public void tocaMusica(Integer codigoDaMusica, Album album) throws RemoteException {
		MusicaDAO musicaDao = new MusicaDAO();
		Musica musica = musicaDao.retornaMusica(codigoDaMusica, album.getId());
		if(musica!=null) {
			System.out.println(musica.getLetra());
		}else {
			System.out.println("Musica não está disponivel no nosso acervo no momento");
		}
		
	}

	@Override
	public Album recuperaAlbum(String nomeDoAlbum) throws RemoteException {
		AlbumDAO albumDAO = new AlbumDAO();
		return albumDAO.findAlbumByNome(nomeDoAlbum);
	}

	@Override
	public Collection<Album> listaAlbuns(String cantor) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sintoniza() {
		String mensagemDeBoasVindas = "Você está escutando a RockStar Radio, 3,14fm";
		return null;
	}

}
