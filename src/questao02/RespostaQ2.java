package questao02;

import java.util.*;

public class RespostaQ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite a string: ");
        String palavra = sc.nextLine();

        VerificaCaracter verifica = new VerificaCaracter(palavra);

        
        verifica.mostrarResultado();

        sc.close();
    }
}
