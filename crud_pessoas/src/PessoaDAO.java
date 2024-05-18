import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDAO {
    public void cadastrar(Pessoa p) throws Exception {

        // Clausula catch or declare

        // Especificar o comando SQL
        var sql = "INSERT INTO tb_pessoa(nome, fone, email, idade) VALUES(?, ?, ?, ?)";

        // Estabelecer uma conexao com o banco
        Connection conexao = ConnectionFactory.getConnection();

        // Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);

        // Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        ps.setInt(4, p.getIdade());

        // Executar o comando
        ps.execute();

        // Fechar a conexao
        ps.close();
        conexao.close();
    }

    public boolean consultarCod(Pessoa p) throws Exception {
        var sql = "SELECT 1 FROM tb_pessoa WHERE cod_pessoa = ?";
        try (
                var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, p.getCodigo());
            try (var rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void atualizar(Pessoa p) throws Exception {
        // 1. Especificar comando sql
        var sql = "UPDATE tb_pessoa SET nome?, fone=?, email=?, idade=? WHERE cod_pessoa = ?";
        // 2. Estabelecer uma conexao com o SGBD
        // try with resources
        try (
                var conexao = ConnectionFactory.getConnection();
                // 3. Preparar o comando
                var ps = conexao.prepareStatement(sql);) {
            // 4. Substituir os eventuais placeholders
            ps.setString(1, p.getNome());
            ps.setString(2, p.getFone());
            ps.setString(3, p.getEmail());
            ps.setInt(4, p.getIdade());
            ps.setInt(5, p.getCodigo());
            // 5. Executar o comando
            // 6. fechar os recursos
        }

    }

    public void deletar(Pessoa p) throws Exception {
        // 1. Especificar o comando SQL

        var sql = "DELETE FROM tb_pessoa WHERE cod_pessoa = ?";

        try (
                // 2. Estabelecer uma conexao com o SGBD
                var conexao = ConnectionFactory.getConnection();

                // 3, Preparar o comando
                var ps = conexao.prepareStatement(sql);) {

            // 4. Substituir os eventuais placeholders
            ps.setInt(1, p.getCodigo());

            // 5. Executar o comando
            ps.execute();

            // 6. Fechar os recursos (o try with resources ja faz)

        }

    }

    public java.util.List<Pessoa> listar() throws Exception {
        // 1. Construir uma lista
        var pessoas = new java.util.LinkedList<Pessoa>();
        // 2. Especificar o comando SQL
        var sql = "SELECT * FROM tb_pessoa";
        try (
                // 3. Estabelecer uma conexão com o SGBD
                var conexao = ConnectionFactory.getConnection();
                // 4. Preparar o comando
                var ps = conexao.prepareStatement(sql);
                // 5. Substituir os eventuais placeholders (não tem nenhum)
                // 6. Executar o comando
                java.sql.ResultSet rs = ps.executeQuery();) {
            // 7. Lidar com o resultado
            while (rs.next()) {
                var pessoa = new Pessoa(
                        rs.getInt("cod_pessoa"),
                        rs.getString("nome"),
                        rs.getString("fone"),
                        rs.getString("email"),
                        rs.getInt("idade"));
                pessoas.add(pessoa);
            }
            // 8. Fechar os recursos (o try-with-resources já faz)
            // 9. Devolver a lista
            return pessoas;
        }
    }
}