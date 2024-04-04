import java.util.Arrays;

public class ExemplosBasicosVetores {
  public static void main(String[] args) {
    //vetores são objetos, moram na heap
    //variável de referência para um vetor de inteiros
    // int [] v1; //também pode ser assim: int v1 [];
    // double [] v3 = new double[20];
    // v1 = new int[4];
    // String [] v2 = new String[3];
    // v1[0] = 2;
    // v1[3] = 74;
    // v2[0] = "Ana";
    // v2[1] = "Pedro";
    // System.out.println(v1[1]);
    // System.out.println(v2[2]);
    // // System.out.println(v1[-1]);
    // // System.out.println(v1[4]);
    // // System.out.println(v1.length);
    // // System.out.println(v1[v1.length]);
    // // for(int i = 0; i < v1.length; i++)
    // //   System.out.println(v1[i]);
    // int [] v3 = new int []{1, 4, 3, 2, 1, 6, 5, 4};
    // Arrays.sort(v3);
    // //for comum
    // for(int i = 0; i < v3.length; i++){
    //   System.out.println(v3[i]);
    // }
    // //enhanced for / for each (a partir do Java 5)
    // for(int aux : v1){
    //   System.out.println(aux);
    // }

    Personagem [] personagens = new Personagem[4];
    // System.out.println(personagens[0].energia); //NullPointerException
    personagens[0] = new Personagem();
    personagens[1] = new Personagem(5, 5, 5);
    personagens[2] = new Personagem(10, 0, 5);
    personagens[3] = new Personagem(3, 3, 4);

    personagens[0].nome = "Ana";
    for (Personagem p : personagens){
      p.nome = "Pedro";
      System.out.println(p);
    }
    // System.out.println(personagens[0].nome);
    // System.out.println(personagens[1].nome);
    
    

  }
}
