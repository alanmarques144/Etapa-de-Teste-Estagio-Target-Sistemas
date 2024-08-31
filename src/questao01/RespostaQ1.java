package questao01;

import java.util.Scanner;

public class RespostaQ1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        VerificaFibonacci verifica = new VerificaFibonacci(num);

        verifica.mostrarResultado();

        sc.close();
    }
}
