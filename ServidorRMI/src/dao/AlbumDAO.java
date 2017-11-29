package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Album;
import model.Musica;
import service.GerenciaBD;

public class AlbumDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String sql;

	public AlbumDAO() {
		con = GerenciaBD.retornaConexao();
	}

	public Album findAlbumByNome(String nomeDoAlbum) {
		Album album = new Album();
		con = GerenciaBD.retornaConexao();
		sql = "Select * from album where nomeDoAlbum = ?";
		String sqlMusica = "Select * from musica where idAlbum = ?";
		PreparedStatement pstmtMusica;
		ResultSet resMusica;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nomeDoAlbum);
			res = pstmt.executeQuery();
			res.next();
			album.setId(res.getInt("id"));
			album.setNomeDoCantor(res.getString("nomeDoCantor"));
			album.setNomeDoAlbum(nomeDoAlbum);

			pstmtMusica = con.prepareStatement(sqlMusica);
			pstmtMusica.setInt(1, album.getId());
			resMusica = pstmtMusica.executeQuery();
			ArrayList<Musica> musicas = new ArrayList();
			while (res.next()) {
				Musica musica = new Musica();
				musica.setId(resMusica.getInt("id"));
				musica.setIdAlbum(resMusica.getInt("idAlbum"));
				musica.setNumeroDaFaixa(resMusica.getInt("numeroDaFaixa"));
				musica.setLetra(resMusica.getString("letra"));
				musicas.add(musica);
			}
			album.setFaixas(musicas);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return album;
	}

	public ArrayList<Album> findAlbunsByCantor(String nomeDoCantor) {
		ArrayList<Album> albuns = new ArrayList();

		con = GerenciaBD.retornaConexao();
		sql = "Select * from album where nomeDoCantor = ?";
		String sqlMusica = "Select * from musica where idAlbum = ?";
		PreparedStatement pstmtMusica;
		ResultSet resMusica;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nomeDoCantor);
			res = pstmt.executeQuery();
			while (res.next()) {
				Album album = new Album();

				album.setId(res.getInt("id"));
				album.setNomeDoCantor(res.getString("nomeDoCantor"));
				album.setNomeDoAlbum(res.getString("nomeDoAlbum"));
				pstmtMusica = con.prepareStatement(sqlMusica);
				pstmtMusica.setInt(1, album.getId());
				resMusica = pstmtMusica.executeQuery();
				ArrayList<Musica> musicas = new ArrayList();
				while (res.next()) {
					Musica musica = new Musica();
					musica.setId(resMusica.getInt("id"));
					musica.setIdAlbum(resMusica.getInt("idAlbum"));
					musica.setNumeroDaFaixa(resMusica.getInt("numeroDaFaixa"));
					musica.setLetra(resMusica.getString("letra"));
					musicas.add(musica);
				}
				album.setFaixas(musicas);
				albuns.add(album);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return albuns;
	}

}
