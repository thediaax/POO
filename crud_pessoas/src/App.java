import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
    var menu ="1 - Cadastrar\n2- Atualizar\n3 - Apagar\n4- Listar\n5- Ver idade media no java\n6- Ver idade media no banco de dados\n0 - sair\n"; 
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
                case 2:{
                    // var msg = "o que deseja atualizar?\n1- Nome\n2- Fone\n3- Email\n4- Idade";
                    // JOptionPane.showInputDialog(msg);
                    // int ops = 0;
                    // switch (ops) {
                    //     case 1:{
                    //         var nome = JOptionPane.showInputDialog("Nome?");
                    //         break;
                    //     }
                            
                    
                    //     case 2:{
                    //         var fone = JOptionPane.showInputDialog("Fone?");
                    //         break;
                    //     }
                    //     case 3:{
                    //         var email = JOptionPane.showInputDialog("Email?");
                    //         break;
                    //     }

                    //     case 4:{
                    //         var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
                    //         break;
                    //     }
                    //     case 5:{
                            
                    //     }
                    // }
                    // 1. pegar os dados juntos ao usuario
                    var nome = JOptionPane.showInputDialog("Nome?");
                    var fone = JOptionPane.showInputDialog("Fone?");
                    var email = JOptionPane.showInputDialog("Email?");
                    var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
                    var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                        
                    // 2. construir um objeto pessoa
                    var p = new Pessoa(codigo, nome, fone, email, idade);
                    // 3. construir um objeto dao
                    var dao = new PessoaDAO();
                    // 4. atualizar usando dao
                    dao.atualizar(p);
                    // 5. confirmar atualização
                    JOptionPane.showMessageDialog(null, "Atualização OK!");
                    break;
                }
                case 3:{
                    var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    var p = new Pessoa(codigo);
                    var dao = new PessoaDAO();
                    dao.deletar(p);
                    JOptionPane.showMessageDialog(null, "Remoção OK!");
                    break;
                }
                case 4:{
                    var pessoas = new PessoaDAO().listar();
                    var sb = new StringBuilder("");
                    for (var p : pessoas){
                      sb.append(p).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb);
                    break;
                  }
                case 5:{
                    break;

                }
                case 6:{
                    break;
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Até mais!");
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
