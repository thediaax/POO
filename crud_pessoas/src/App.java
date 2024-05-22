import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        var menu = "1 - Cadastrar\n2- Atualizar\n3 - Apagar\n4- Listar\n5- Ver idade media no java\n6- Ver idade media no banco de dados\n0 - sair\n";
        int op = 0;
        do {

            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op) {
                    case 1: {
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));

                        var p = new Pessoa(0, nome, fone, email, idade);
                        var dao = new PessoaDAO();
                        dao.cadastrar(p);
                        JOptionPane.showMessageDialog(null, "cadastro OK!");
                        break;
                    }
                    case 2: {
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do usuario?"));
                        var pt = new Pessoa(codigo, "", "", "",0);
                        var dao0 = new PessoaDAO();
                        if (dao0.consultarCod(pt)) {

                            var msg = "o que deseja atualizar?\n1- Nome\n2- Fone\n3- Email\n4- Idade";
                            int ops = Integer.parseInt(JOptionPane.showInputDialog(msg));
                            var id = 0;
                            var nome = "";
                            var fone = "";
                            var email = "";
                            var idade = 0;

                            switch (ops) {
                                case 1: {
                                    nome = JOptionPane.showInputDialog("Nome?");
                                    pt.setNome(nome);
                                    break;
                                }

                                case 2: {
                                    fone = JOptionPane.showInputDialog("Fone?");
                                    pt.setNome(fone);
                                    break;
                                }
                                case 3: {
                                    email = JOptionPane.showInputDialog("Email?");
                                    pt.setEmail(email);
                                    break;
                                }

                                case 4: {
                                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
                                    pt.setIdade(idade);
                                    break;
                                }
                                case 5: {
                                    id = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                                    pt.setCodigo(codigo);
                                    break;
                                }
                            }

                            // 1. pegar os dados juntos ao usuario
                            // var id = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                            // var nome = JOptionPane.showInputDialog("Nome?");
                            // var fone = JOptionPane.showInputDialog("Fone?");
                            // var email = JOptionPane.showInputDialog("Email?");
                            // var idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));

                            // 2. construir um objeto pessoa
                            var p = new Pessoa(id, nome, fone, email, idade);
                            // 3. construir um objeto dao
                            var dao = new PessoaDAO();
                            // 4. atualizar usando dao
                            dao.atualizar(p);
                            // 5. confirmar atualização
                            JOptionPane.showMessageDialog(null, "Atualização OK!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "O codigo inserido não existe");
                        }
                        break;
                    }
                    case 3: {
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual pessoa deseja excluir? insira o codigo."));
                        var p = new Pessoa(codigo, "", "", "", 0);
                        var dao = new PessoaDAO();
                        dao.deletar(p);
                        JOptionPane.showMessageDialog(null, "Remoção OK!");
                        break;
                    }
                    case 4: {
                        var pessoas = new PessoaDAO().listar();
                        var sb = new StringBuilder("");
                        for (var p : pessoas) {
                            sb.append(p).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb);
                        break;
                    }
                    case 5: {
                        break;

                    }
                    case 6: {
                        break;
                    }
                    case 0: {
                        JOptionPane.showMessageDialog(null, "Até mais!");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Coisas ruins acontecem...");

            }
        } while (op != 0);
    }

}
