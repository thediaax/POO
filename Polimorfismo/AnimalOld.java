public class AnimalOld{
    private int tipo;
 
        public void falar(){
        if(getTipo() == 1)
            System.out.println("miau");
        else if(getTipo() == 2)
            System.out.println("auau");
        else if (getTipo() == 3)
            System.out.println("quack");
        }

        public int getTipo() {
            return tipo;
            
        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
            
        }

}