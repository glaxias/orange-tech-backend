package edu.michjenn.primeiraaula;
public class Exemplo3 {
    public static void main (String [] args) {
        String primeiroNome = "Mich";
        String segundoNome = "Ramalho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
