import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Playlist {
  public static void main(String[] args) {
    ArrayList <Musica> musicas = new ArrayList<>();
    //0-Sair
    //1-Cadastrar música
    //2-Avaliar música
    //3-Ver a lista ordenada pelo nome
    //4. Ver a lista ordenada pela avaliação
    var menu = "0-Sair\n1-Cadastrar música\n2-Avaliar música\n3-Ver lista ordenada pelo nome\n4-Ver lista ordenada pela avaliação";
    
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(op){
        case 1:{
          // var titulo = JOptionPane.showInputDialog("Titulo?");
          // var musica = new Musica(titulo);
          musicas.add(new Musica(JOptionPane.showInputDialog("Titulo?")));
          JOptionPane.showMessageDialog(null, "Cadastro OK");
          break;
        }
        case 2:{
          String titulo = JOptionPane.showInputDialog("Titulo?");
          //for each (enhanced for)
          var achou = false;
          for (Musica m : musicas){
            if(m.getTitulo().equals(titulo)){
              m.avaliar(Integer.parseInt(JOptionPane.showInputDialog("Nota")));
              // JOptionPane.showMessageDialog(null, "Avaliação OK");
              achou = true;
              break;
            }
          }
          JOptionPane.showMessageDialog(
            null, achou ? "Avaliação OK" : "Música não encontrada"
          );
          break;
        }
        case 3:{
          Collections.sort(musicas);
          JOptionPane.showMessageDialog(null, musicas);
          break;
        }
        case 4: {
          Collections.sort(musicas, new PorAvaliacaoComparator());
          JOptionPane.showMessageDialog (null, musicas);
          break;
        }
        case 0:{
          JOptionPane.showMessageDialog(null, "Até mais");
          break;
        }
      }

    }while (op != 0);
  }
}

class PorAvaliacaoComparator implements Comparator <Musica>{
  @Override
  public int compare(Musica m1, Musica m2) {
    if(m1.getAvaliacao() > m2.getAvaliacao())
      return -1;
    if (m1.getAvaliacao() == m2.getAvaliacao())
      return 0;
    return 1;
    // return m1.getAvaliacao() > m2.getAvaliacao() ? -1 : m1.getAvaliacao() == m2.getAvaliacao() ? 0 : 1;
  }

}

//fazer um comparator que compara pelo comprimento do nome
//fazer um comparator que compara por titulo, depois por avaliacao
//adicionar dois cases para testar
