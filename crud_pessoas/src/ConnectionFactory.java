import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private static String host = "pg-30853102-gabrieldias.f.aivencloud.com";
    private static String port = "25145";
    private static String user = "avnadmin";
    private static String db = "20241_fatec_ipi_poo";
    private static String password = "AVNS_ddbU6USqGUCHenjgYx_";
    
    public static Connection getConnection() throws Exception{
        
            var s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                host, port, db);
            Connection conexao = DriverManager.getConnection(s, user, password);
            return conexao;

        
        }
}