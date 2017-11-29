package principal;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import interfaces.IRadioService;

public class Index {

	private static IRadioService rockstarRadio;

	public static void main(String[] args) {
		try {
			rockstarRadio = (IRadioService) Naming.lookup("//localhost/rockstarradio");
			rockstarRadio.tocaMusica(0, null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}
}
