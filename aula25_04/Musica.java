public class Musica {
    private String titulo;
    //1 a 5 (0 significa ainda não avaliada)
    private int avaliacao = 0;
  
    public Musica(String titulo){
      this.titulo = titulo;
    }
  
    public String getTitulo() {
      return titulo;
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
  }