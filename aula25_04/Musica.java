public class Musica implements Comparable <Musica>{
  private String titulo;
  //1 a 5 (0 significa ainda não avaliada)
  private int avaliacao = 0;

  public Musica(String titulo){
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getAvaliacao() {
    return avaliacao;
  }

  public void avaliar(int avaliacao){
    this.avaliacao = avaliacao;
  }

  public String toString() {
    //(titulo: Creep, avaliacao: 5)
    return String.format(
      "(titulo: %s, avaliacao: %d)",
      titulo, avaliacao
    );
  }

  public int compareTo(Musica m) {
    //se o this for menor do que o m, devolver -1
    //se forem iguais, devolver 0
    //caso contrário, devolver 1
    return this.getTitulo().compareTo(m.getTitulo());
  }
}