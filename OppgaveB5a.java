//Oppgave O1
import static javax.swing.JOptionPane.*;

public class OppgaveB5a {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn poengsum (0-100):");
        
        int poengsum;
        
        try {
            poengsum = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Ugyldig inndata. Vennligst oppgi et heltall.");
            return;
        }

        if (poengsum < 0 || poengsum > 100) {
            showMessageDialog(null, "Ugyldig poengsum! Vennligst oppgi en poengsum mellom 0 og 100.");
            return;
        }

        String karakter;
        if (poengsum >= 90) {
            karakter = "A";
        } else if (poengsum >= 80) {
            karakter = "B";
        } else if (poengsum >= 60) {
            karakter = "C";
        } else if (poengsum >= 50) {
            karakter = "D";
        } else if (poengsum >= 40) {
            karakter = "E";
        } else {
            karakter = "F";
        }

        showMessageDialog(null, "Din karakter er: " + karakter);
    }
}
