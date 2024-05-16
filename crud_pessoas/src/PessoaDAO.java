import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDAO {
    public void cadastrar(Pessoa p) throws Exception{
        
        //Clausula catch or declare
        
        //Especificar o comando SQL
        var sql = "INSERT INTO tb_pessoa(nome, fone, email, idade) VALUES(?, ?, ?, ?)";

        //Estabelecer uma conexao com o banco
        Connection conexao = ConnectionFactory.getConnection();

        //Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);

        //Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        ps.setInt(4, p.getIdade());

        //Executar o comando
        ps.execute();

        //Fechar a conexao
        ps.close();
        conexao.close();
    }
}