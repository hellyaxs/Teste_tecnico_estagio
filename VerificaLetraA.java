import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaLetraA {
    public static void main(String[] args) {
        String texto = "Esta é uma String de exemplo para contar letras A e a.";

        // Regex para encontrar 'a' ou 'A'
        Pattern padrao = Pattern.compile("[aA]");
        Matcher matcher = padrao.matcher(texto);

        short contador = 0;
        while (matcher.find()) {
            contador++;
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' foi encontrada " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada na string.");
        }
    }
}
