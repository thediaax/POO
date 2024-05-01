public class TesteVetorGenerico{
  public static void main(String[] args) {
    VetorDinamico <Integer> v = new VetorDinamico<>();
    VetorDinamico <String> v2 = new VetorDinamico<>();
    VetorDinamico <Musica> v3 = new VetorDinamico<>();
    v.adicionar(1);
    System.out.println(v);
    System.out.println("*******************");
    v2.adicionar("Um teste qualquer usando string");
    v2.adicionar("Outro teste qualquer usando string");
    System.out.println(v2);
    System.out.println("*******************");
    v3.adicionar(new Musica("Creep - Radiohead"));
    System.out.println(v3);
  }
}