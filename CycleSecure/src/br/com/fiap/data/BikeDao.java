package br.com.fiap.data;

import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Bike;

public class BikeDao {

    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER = "rm98837";
    private static final String PASS = "280101";

    // Inserir usuario e senha para acesso do professor na linha 15 e 16:
    // 
    
    public void inserir(Bike bike) throws SQLException {
        var conexao = DriverManager.getConnection(URL, USER, PASS);
        var sql = "INSERT INTO BICICLETA(MODELO, MARCA, ANO, PRECO, NUMERO_SERIE, TIPO) VALUES  (?, ?, ?, ?, ?, ?)";
        var comando = conexao.prepareStatement(sql);
        comando.setString(1, bike.getModelo());
        comando.setString(2, bike.getMarca());
        comando.setInt(3, bike.getAno());
        comando.setInt(4, bike.getValor());
        comando.setString(5, bike.getChassi());
        comando.setString(6, bike.getCategoria());
        comando.executeUpdate();
        comando.close();
    }

}
