public class TestePotencia2 {
  public static void main(String[] args) {
    for (int i = 0; i <= 1000; i++){
      VetorDinamico v = new VetorDinamico(i);
      System.out.println(i + ": " + v.cap);
    }
  }
}
