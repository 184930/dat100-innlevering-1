// Oppgave O3 
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn et heltall n > 0:");
        int n = Integer.parseInt(input);

        if (n <= 0) {
            showMessageDialog(null, "Vennligst skriv inn et heltall som er større enn 0.");
            return;
        }

        long fakultet = 1;
        for (int i = 1; i <= n; i++) {
            fakultet *= i;
        }
        showMessageDialog(null, "Verdien av " + n + "! er " + fakultet);
    }
}
