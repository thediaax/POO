public class TesteCalculadora {
    
    public static void main (String [] args){
        System.out.println("A coisa começa aqui");    
        Calculadora calc = new Calculadora();
        int soma = calc.somar(7,8);
        calc.somar(5,2);
        soma = soma + calc.somar(2,2);
        soma = soma + calc.somar(15,17);
        System.out.println(soma);
        System.out.println("Até mais");
    }
}
