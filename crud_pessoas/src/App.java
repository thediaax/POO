import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
    var menu ="1 - Cadastrar\n2- Atualizar\n3 - Apagar\n4- Listar\n5- Ver idade media\n0 - sair\n"; 
    int op = 0;
    do{
        
        try{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:{
                    var nome = JOptionPane.showInputDialog("Nome?");
                    var fone = JOptionPane.showInputDialog("Fone?");
                    var email = JOptionPane.showInputDialog("Email?");
                    var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));

                    var p = new Pessoa(0,nome, fone, email, idade);
                    var dao = new PessoaDAO();
                    dao.cadastrar(p);
                    JOptionPane.showMessageDialog(null, "cadastro OK!");
                    break;
                }
        }
    }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Coisas ruins acontecem...");

        }
    }while(op != 0);
    }
}
