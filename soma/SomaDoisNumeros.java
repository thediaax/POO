import java.util.Scanner;
public class SomaDoisNumeros{
  static public void main(String... args){
    var leitor = new Scanner(System.in);
    //declaração de variaveis
    double primeiroNumero, segundoNumero; //entrada de dados
    double resultado; //saida de dados
    System.out.println ("Digite o primeiro numero");
    primeiroNumero = leitor.nextDouble();
    System.out.println ("Digite o segundo numero");
    segundoNumero = leitor.nextDouble();
    resultado = primeiroNumero + segundoNumero; 

    System.out.printf("a soma de %f + %f é igual a %f",
    primeiroNumero, segundoNumero, resultado );




  }
}