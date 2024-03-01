import javax.swing.JOptionPane;
// import java.lang.String;
// import java.lang.System;

public class SomaDoisNumerosV2{
    public static void main(String [] x){

        int v1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o primeiro valor"));

        int v2 = Integer.parseInt(
            JOptionPane.showInputDialog("digite  o valor 2"));

        int resultado = v1 + v2;
        JOptionPane.showMessageDialog(null,
        String.format("%d + %d = %d", v1, v2, resultado));
    }
}
