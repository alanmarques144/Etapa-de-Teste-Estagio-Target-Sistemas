package questao03;

public class RespostaQ3 {
    public static void main(String[] args) throws Exception {
        
        int indice = 12, soma = 0, k = 1;

        while (k < indice) {
            k=k+1;
            soma = soma + k;
        }

        // O resultado é: 77
        System.out.println("O resultado é: " + soma);
    }
}