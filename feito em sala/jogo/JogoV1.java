public class JogoV1 {
    public static void main(String[] args) {

        var p = new Personagem();
        p.nome = "Rodolfo";
        p.cacar();
        System.out.printf("%s", p.toString());
        p.comer();
        System.out.println(p);
        System.out.println("***********************");
        p.dormir();
        System.out.println(p);
        System.out.println("***********************");
        p.comer();
        System.out.println(p);
        System.out.println("***********************");
        p.dormir();
        System.out.println(p);
        System.out.println("***********************");
        p.cacar();
    }
    
}
