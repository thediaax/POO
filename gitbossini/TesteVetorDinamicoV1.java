import java.util.Random;
public class TesteVetorDinamicoV1 {
  public static void main(String[] args) {
    var v = new VetorDinamico();
    var gerador = new Random();
    while(true){
      v.adicionar(gerador.nextInt(6) + 1);
    }
  }
}
