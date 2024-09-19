// Oppgave O2
import static javax.swing.JOptionPane.*;

public class Oppgave6 {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn bruttoinntekt i kroner:");
        
        if (input != null && !input.isEmpty()) {
            try {
                double bruttoInntekt = Double.parseDouble(input);
                double trinnskatt = beregnTrinnskatt(bruttoInntekt);
                
                showMessageDialog(null, "Trinnskatten for en bruttoinntekt på " + bruttoInntekt + " kr er: " + trinnskatt + " kr.");
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Vennligst skriv inn et gyldig tall.");
            }
        } else {
            showMessageDialog(null, "Ingen inntekt er oppgitt.");
        }
    }
    
    public static double beregnTrinnskatt(double bruttoInntekt) {
        double trinnskatt = 0;
        
        if (bruttoInntekt > 208050) {
            if (bruttoInntekt <= 267900) {
                trinnskatt += (bruttoInntekt - 208050) * 0.017;
            } 
            else if (bruttoInntekt <= 643800) {
                trinnskatt += (267900 - 208050) * 0.017; 
                trinnskatt += (bruttoInntekt - 267900) * 0.04; 
            } 
            else if (bruttoInntekt <= 969200) {
                trinnskatt += (267900 - 208050) * 0.017; 
                trinnskatt += (643800 - 267900) * 0.04; 
                trinnskatt += (bruttoInntekt - 643800) * 0.13; 
            } 
            else {
                trinnskatt += (267900 - 208050) * 0.017; 
                trinnskatt += (643800 - 267900) * 0.04; 
                trinnskatt += (969200 - 643800) * 0.13; 
                trinnskatt += (bruttoInntekt - 969200) * 0.165; 
            }
        }
        
        return trinnskatt;
    }
}
