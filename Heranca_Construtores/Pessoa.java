public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        if(idade >= 18)
            this. idade = idade;
    }
    public Pessoa (String nome){
        this(nome, 0);
    }
    public Pessoa(int idade){
        this(null, idade);
    }
}