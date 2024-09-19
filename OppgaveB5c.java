// Oppgave O1 

import static javax.swing.JOptionPane.*;

public class OppgaveB5c {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { 
            String input = showInputDialog("Skriv inn poengsum for student " + i + " (0-100):");
            
            int poengsum;
            
            try {
                poengsum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ugyldig inndata. Vennligst oppgi et heltall.");
                i--; 
                continue; 
            }

            if (poengsum < 0 || poengsum > 100) {
                showMessageDialog(null, "Ugyldig poengsum! Vennligst oppgi en poengsum mellom 0 og 100.");
                i--; 
                continue; 
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
            showMessageDialog(null, "Student " + i + ": Din karakter er: " + karakter);
        }
    }
}
