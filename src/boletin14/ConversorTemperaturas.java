package boletin14;

public class ConversorTemperaturas {

    final float temp = 80;

    public void centigradosAFharenheit(float cent) throws TemperaturaErradaExcepcion {
        double fahr = cent * 1.8 + 32.4;
        if (cent < 80) {
            throw new TemperaturaErradaExcepcion();
        } else {
            System.out.println("Conversión a Fahrenheit: " + fahr);
        }
    }

    public void centígradosAReamur(float cent) {
        double ream = 0.8 * cent;
        System.out.println("Conversión a Reaumur: " + ream);
        
    }

}
