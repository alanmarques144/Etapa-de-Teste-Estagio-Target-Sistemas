package questao01;

public class VerificaFibonacci {
    
    private int num;

    public VerificaFibonacci(int num) {
        this.num = num;
    }


    public boolean calcularFibonacci() {
        int n1 = 0, n2= 1, prox = 0;

        for (int i = 0; prox <= num; i++) {
            if (prox == num) {
                return true;
            }
            n1 = n2;
            n2 = prox;
            prox = n1 + n2;
        }
        return false;
    }

    public void mostrarResultado() {
        if (calcularFibonacci()) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número não pertence à sequência de Fibonacci.");
        }
    }
}
