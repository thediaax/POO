public class VetorDinamico {
  //variáveis de instância (cada instância ou objeto tem a sua cópia)
  private int qtde;
  private int cap;
  private int [] elementos;
  //variável de classe (todas as instâncias compartilham este mesmo valor)
  private static final int CAP_MINIMA = 4;
  VetorDinamico(){
    cap = CAP_MINIMA;
    qtde = 0;
    elementos = new int[CAP_MINIMA];
  }

  VetorDinamico(int capMinima){
    double aux = capMinima;
    while (aux >= 2)
      aux /= 2;
    cap = aux == 1 && capMinima > 3 ? capMinima : CAP_MINIMA;
  }

  //terminar esse método
  void adicionar(int elemento){
    //se estiver cheio, redimensionar antes de adicionar
    if(estaCheio())redimensionar();
    elementos[qtde] = elemento;
    qtde++;
  }

  //escrever esse aqui também
  boolean estaCheio(){
    //decidir se o vetor está cheio ou não olhando para cap e qtde
  }

  //escrever esse método
  void redimensionar(){
    //alocar um vetor com o dobro da capacidade atual chamado auxiliar

    //copiar todo mundo do vetor elementos para o vetor auxiliar

    //ajustar a capacidade para que ela tenha o valor novo, dobrado

    //ajustar o ponteiro elementos para que ele aponte para o novo vetor
  }
}
