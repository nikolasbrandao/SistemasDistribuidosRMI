package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Musica;
import service.GerenciaBD;

public class MusicaDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String sql;
	
	public MusicaDAO() {
		con = GerenciaBD.retornaConexao();
	}
	
	public Musica retornaMusica(int idMusica, int idAlbum) {
		Musica musica = new Musica();
		con = GerenciaBD.retornaConexao();
		
		sql = "Select * from musica where id = ? and idAlbum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idMusica);
			pstmt.setInt(2, idAlbum);
			res = pstmt.executeQuery();
			while(res.next()){
				musica.setId(res.getInt("id"));
				musica.setIdAlbum(res.getInt("idAlbum"));
				musica.setNumeroDaFaixa(res.getInt("numeroDaFaixa"));
				musica.setLetra(res.getString("letra"));
			}
			pstmt.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}			
		
		return musica;
	}
	

}
