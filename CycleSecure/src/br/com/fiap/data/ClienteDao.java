package br.com.fiap.data;

import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Cliente;

public class ClienteDao {

    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER = "rm98837";
    private static final String PASS = "280101";

        public void inserir(Cliente cliente) throws SQLException {
        var conexao = DriverManager.getConnection(URL, USER, PASS);
        var sql = "INSERT INTO CLIENTE(NOME, DATA_NASC, CPF, EMAIL, ENDERECO) VALUES  (?, ?, ?, ?, ?)";
        var comando = conexao.prepareStatement(sql);
        comando.setString(1, cliente.getNome());
        comando.setString(2, cliente.getDataNascimento());
        comando.setString(3, cliente.getCpf());
        comando.setString(4, cliente.getEmail());
        comando.setString(5, cliente.getEndereco());
        comando.executeUpdate();
        comando.close();
    }
    
}
