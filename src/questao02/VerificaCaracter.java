package questao02;

public class VerificaCaracter {
    
    
    private String palavra;

    public VerificaCaracter(String palavra) {
        this.palavra = palavra;
    }

    public int contarLetras() {
        
        int count = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'A'){
                count++;
            }
        }

        return count;
    }

    public void mostrarResultado() {
        int contador = contarLetras();
        if(contador >= 1){
                System.out.println("A letra 'a' aparece " + contador + " vezes!");
        }else{        
                System.out.println("A letra 'a' não aparece na string.");
        }        
    }
}
