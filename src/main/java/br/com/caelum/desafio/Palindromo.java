package br.com.caelum.desafio;

public class Palindromo {
    public boolean ehPalindromo(String frase) {

        String fraseFiltrada = frase
                .toUpperCase().replace(" ", "").replace("-", "");

        int lengthFraseFiltrada = fraseFiltrada.length() - 1;
        for(int i = 0; i < fraseFiltrada.length(); i++) {
            
        	if(fraseFiltrada.charAt(i) != 
                    fraseFiltrada.charAt(lengthFraseFiltrada -i)) {
                return false;
            }
        }

        return true;
    }
}
