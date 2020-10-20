import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse AnalyseTest testet die korrekte Implementierung der verschiedenen Analyse-Methoden.
 *
 * @author  Sebastian Funke
 * @version 2020-10-09
 */
public class AnalyseTest
{
    private double[][] testmessungen;
    private final int laengeEinerTestreihe = 10;
    private final int anzahlTestmessungen = 6;
    private Analyse[] analysen;
    
    /**
     * Konstruktor fuer die Test-Klasse AnalyseTest
     */
    public AnalyseTest()
    {
        testmessungen = new double[anzahlTestmessungen][laengeEinerTestreihe];
        erzeugeTestmessungen();
        this.analysen = new Analyse[6];
        
        for (int i = 0; i < anzahlTestmessungen; i++) {
            this.analysen[i] = new Analyse(testmessungen[i]);
        }
    }

    private void erzeugeTestmessungen() {
        // Testmessung 1: aufsteigende Folge natürlicher Zahlen
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[0][i] = (double)i;
        }
        
        // Testmessung 2: lauter Nullen
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[1][i] = 0;
        }
        
        // Testmessung 3: lauter Einsen
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[2][i] = 1;
        }
        
        // Testmessung 4: immer Minus-Eins
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[3][i] = -1;
        }
        
        // Testmessung 5: Zufällig Folge von Zahlen
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[4][i] = ((Math.random()*20)-10);
        }
        
        // Testmessung 6: Fehler-Provokation
        for (int i = 0; i < laengeEinerTestreihe; i++) {
            testmessungen[5][i] = ((Math.random()*20)-10);
        }
        testmessungen[5][0] = 0;
    }
    
    
    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     *  Unschöne Implementierung zur Berechnung der Summe, um die schöne Lösung zu testen ohne sie zu verraten,
     *  aber andererseits einen Tipp zu richtigen (iterativen) Lösung zu geben.
     */
    private double gibSummeZurueck(double[] testreihe) {
        double sum = 0;
        sum = sum + testreihe[0];
        sum = sum + testreihe[1];
        sum = sum + testreihe[2];
        sum = sum + testreihe[3];
        sum = sum + testreihe[4];
        sum = sum + testreihe[5];
        sum = sum + testreihe[6];
        sum = sum + testreihe[7];
        sum = sum + testreihe[8];
        sum = sum + testreihe[9];
        return sum;
    }
    
    /**
     *  Unschöne Implementierung zur Berechnung des Durchschnitts, um die schöne Lösung zu testen ohne sie zu verraten,
     *  aber andererseits einen Tipp zu richtigen (iterativen) Lösung zu geben.
     */
    private double gibDurchschnittZurueck(double[] testreihe) {
        double sum = 0;
        sum = sum + testreihe[0];
        sum = sum + testreihe[1];
        sum = sum + testreihe[2];
        sum = sum + testreihe[3];
        sum = sum + testreihe[4];
        sum = sum + testreihe[5];
        sum = sum + testreihe[6];
        sum = sum + testreihe[7];
        sum = sum + testreihe[8];
        sum = sum + testreihe[9];
        
        return sum/testreihe.length;
    }
    
    /**
     *  Unschöne Implementierung zur Berechnung des Index, um die schöne Lösung zu testen ohne sie zu verraten,
     *  aber andererseits einen Tipp zu richtigen (iterativen) Lösung zu geben.
     */
    private double gibIndexZurueck(double[] testreihe, double wert) {
        if (testreihe[0]==wert) {
            return 0;
        }
        if (testreihe[1]==wert) {
            return 1;
        }
        if (testreihe[2]==wert) {
            return 2;
        }
        if (testreihe[3]==wert) {
            return 3;
        }
        if (testreihe[4]==wert) {
            return 4;
        }
        if (testreihe[5]==wert) {
            return 5;
        }
        if (testreihe[6]==wert) {
            return 6;
        }
        if (testreihe[7]==wert) {
            return 7;
        }
        if (testreihe[8]==wert) {
            return 8;
        }
        if (testreihe[9]==wert) {
            return 9;
        }
        return -1;
    }
    
    /**
     *  Unschöne Implementierung zur Berechnung des Maximums, um die schöne Lösung zu testen ohne sie zu verraten,
     *  aber andererseits einen Tipp zu richtigen (iterativen) Lösung zu geben.
     */
    private double gibMaximumZurueck(double[] testreihe) {
        double max = testreihe[0];
        
        if (testreihe[1] > max) {
            max = testreihe[1];
        }
        if (testreihe[2] > max) {
            max = testreihe[2];
        }
        if (testreihe[3] > max) {
            max = testreihe[3];
        }
        if (testreihe[4] > max) {
            max = testreihe[4];
        }
        if (testreihe[5] > max) {
            max = testreihe[5];
        }
        if (testreihe[6] > max) {
            max = testreihe[6];
        }
        if (testreihe[7] > max) {
            max = testreihe[7];
        }
        if (testreihe[8] > max) {
            max = testreihe[8];
        }
        if (testreihe[9] > max) {
            max = testreihe[9];
        }
        
        return max;
    }
    
    /**
     *  Unschöne Implementierung zur Berechnung des Minimums, um die schöne Lösung zu testen ohne sie zu verraten,
     *  aber andererseits einen Tipp zu richtigen (iterativen) Lösung zu geben.
     */
    private double gibMinimumZurueck(double[] testreihe) {
        double min = testreihe[0];
        
        if (testreihe[1] < min) {
            min = testreihe[1];
        }
        if (testreihe[2] < min) {
            min = testreihe[2];
        }
        if (testreihe[3] < min) {
            min = testreihe[3];
        }
        if (testreihe[4] < min) {
            min = testreihe[4];
        }
        if (testreihe[5] < min) {
            min = testreihe[5];
        }
        if (testreihe[6] < min) {
            min = testreihe[6];
        }
        if (testreihe[7] < min) {
            min = testreihe[7];
        }
        if (testreihe[8] < min) {
            min = testreihe[8];
        }
        if (testreihe[9] < min) {
            min = testreihe[9];
        }
        
        return min;
    }
    
    @Test
    public void gibWertTest()
    {
        for (int i = 0; i < anzahlTestmessungen; i++) {
            for (int j = 0; j < laengeEinerTestreihe; j++) {
                assertEquals(testmessungen[i][j], analysen[i].gibWert(j), 0.1);
            }
        }
    }
    
    @Test
    public void gibSummeTest()
    {
        for (int i = 0; i < anzahlTestmessungen; i++) {
            assertEquals(gibSummeZurueck(testmessungen[i]), analysen[i].gibSumme(), 0.1);
            assertEquals(gibSummeZurueck(testmessungen[i]), analysen[i].gibSummeRekursiv(), 0.1);
        }
    }
    
    @Test
    public void gibDurchschnittTest()
    {
        for (int i = 0; i < anzahlTestmessungen; i++) {
            assertEquals(gibDurchschnittZurueck(testmessungen[i]), analysen[i].gibDurchschnitt(), 0.1);
        }
    }
    
    @Test
    public void gibIndexTest()
    {
        assertEquals(gibIndexZurueck(testmessungen[0], 6.0), analysen[0].gibIndex(6.0), 0.1);
        assertEquals(gibIndexZurueck(testmessungen[1], 0), analysen[1].gibIndex(0), 0.1);
        assertEquals(gibIndexZurueck(testmessungen[2], 1.0), analysen[2].gibIndex(1.0), 0.1);
        assertEquals(gibIndexZurueck(testmessungen[3], -1.0), analysen[3].gibIndex(-1.0), 0.1);
        assertEquals(gibIndexZurueck(testmessungen[4], 5.0), analysen[4].gibIndex(5.0), 0.1);
        assertEquals(gibIndexZurueck(testmessungen[5], testmessungen[4][7]), analysen[5].gibIndex(testmessungen[4][7]), 0.1);
    }
    
    @Test
    public void gibMaximumTest()
    {
        for (int i = 0; i < anzahlTestmessungen; i++) {
            assertEquals(gibMaximumZurueck(testmessungen[i]), analysen[i].gibMaximum(), 0.1);
            assertEquals(gibMaximumZurueck(testmessungen[i]), analysen[i].gibMaximumRekursiv(), 0.1);
        }
    }
    
    @Test
    public void gibMinimumTest()
    {
        for (int i = 0; i < anzahlTestmessungen; i++) {
            assertEquals(gibMinimumZurueck(testmessungen[i]), analysen[i].gibMinimum(), 0.1);
            assertEquals(gibMinimumZurueck(testmessungen[i]), analysen[i].gibMinimumRekursiv(), 0.1);
        }
    }
}

