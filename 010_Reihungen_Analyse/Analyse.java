
/**
 * Die Klasse Analyse dient der Analyse einer Reihung von Messwerten.
 * Sie kann zum Beispiel zur Analyse der Ergebnisse einer täglichen Temperaturmessung 
 * über einen Monat hinweg eingesetzt werden.
 * 
 * @author  Sebastian Funke; Lüther
 * @version 2020-10-09; 2020-10-19
 */
public class Analyse
{
    private double[] messwerte;     // Die Messwerte können positiv oder negativ sein.

    public Analyse(double[] messwerte)
    {
        this.messwerte = messwerte;
    }

    /**
     * Die Methode gibMesswert(int) gibt den Wert aus messwerte an der Stelle i zurück.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Der Wert an der Stelle i wird zurückgegeben.
     */
    public double gibWert(int index)
    {
        return messwerte[index];
    }
    
    /**
     * Die Methode gibSumme() gibt die Summe der Reihung messwerte zurück.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Der Durchschnitt der Messwerte wird zurückgegeben.
     */
    public double gibSumme(){
        double sum = 0;
        for (int i = 0; i < messwerte.length; i++) {
            sum += messwerte[i];
        }
        return sum;
    }
    
    /**
     * Die Methode gibDurchschnitt() gibt den Durchschnitt der Reihung messwerte zurück.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Der Durchschnitt der Messwerte wird zurückgegeben.
     */
    public double gibDurchschnitt() {        
        return ( gibSumme()/messwerte.length );
    }
    
    /**
     * Die Methode gibMaximum() gibt das Maximum der Reihung messwerte zurück.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Das Maximum der Messwerte wird zurückgegeben.
     */
    public double gibMaximum() {
        double maximum = messwerte[0];
        for (int i = 1; i < messwerte.length; i++) {
            if (messwerte[i] > maximum) {
                maximum = messwerte[i];
            }
        }
        return maximum;
    }
    
    /**
     * Die Methode gibMinimum() gibt das Minimum der Reihung messwerte zurück.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Das Minimum der Messwerte wird zurückgegeben.
     */
    public double gibMinimum()
    {
        double minimum = messwerte[0];
        for (int i = 1; i < messwerte.length; i++) {
            if (messwerte[i] > minimum) {
                minimum = messwerte[i];
            }
        }
        return minimum;
    }
    
    /**
     * Die Methode gibIndex(double) soll den Index des ersten Vorkommens eines Elements 
     * aus der Reihung messwerte zurückgeben. 
     * Existiert das Element nicht, so soll -1 zurückgegeben werden.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Der Index des gesuchten Werts wird zurückgegeben.
     */
    public double gibIndex(double wert)
    {
        for (int i = 0; i < messwerte.length; i++) {
            if (messwerte[i] == wert) {
                return i;
            }
        }
        return -1;
    }
    
    /** Ab hier folgen zum Teil schwierige Zusatzaufgaben **/
    
    /**
     * Die Methode gibSummeRekursiv(double[], int) berechnet die Summe der Reihung rekursiv und gibt diese zurück.
     * 
     * @param  double int
     * @return double   Die Summe der Messwerte wird zurückgegeben.
     */
    private double gibSummeRekursiv(double[] reihe, int laenge)
    {
        double sum = 0;
        if (laenge > 1) {
            sum += gibSummeRekursiv(reihe, laenge-1);
        }
        return sum;
    }
    
    /**
     * Die Methode gibSummeRekursiv() gibt die Summe der Reihung messwerte zurück 
     * und verwendet dabei eine rekursive Hilfsmethode 
     * mit gleichem Namen aber verschiedener Parameterliste.
     * Das ist ein Beispiel für Polymorphie.
     * 
     * @param  keiner   es wird kein Parameter benötigt
     * @return double   Die Summe der Messwerte wird zurückgegeben.
     */
    public double gibSummeRekursiv()
    {
        return gibSummeRekursiv(messwerte, messwerte.length);
    }
    
    /**
     * Rekursive Implementation, um das Maximum zu ermitteln
     * 
     * Zum Vergleich zweier double-Werte wird die Bibliotheksfunktion max() aus der Math-Bibliothek verwendet.
     */
    private double gibMaximumRekursiv(double[] reihe, int laenge) {
        return 0; // Hier ändern
    }
    
    /**
     * Die Methode gibMaximumRekursiv() gibt das Maximum der Messwerte zurück 
     * und verwendet dabei eine rekursive Hilfsmethode mit gleichem Namen aber verschiedener Parameterliste.
     * Das ist ein Beispiel für Polymorphie.
     */
    public double gibMaximumRekursiv() {
        return gibMaximumRekursiv(messwerte, messwerte.length); 
    }
    
    /**
     * Rekursive Implementation, um das Minimum zu ermitteln
     * 
     * Zum Vergleich zweier double-Werte wird die Bibliotheksfunktion min() aus der Math-Bibliothek verwendet.
     */
    private double gibMinimumRekursiv(double[] reihe, int laenge) {
        return 0; // Hier ändern
    }
    
    /**
     * Die Methode gibMinimumRekursiv() gibt das Minimum der Messwerte zurück 
     * und verwendet dabei eine rekursive Hilfsmethode mit gleichem Namen aber verschiedener Parameterliste.
     * Das ist ein Beispiel für Polymorphie.
     */
    
    public double gibMinimumRekursiv() {
        return 0; // Hier ändern
    }
}
