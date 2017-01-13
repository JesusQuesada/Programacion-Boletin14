package boletin14;

public class ConversorTemperaturas {

    private final float Temp = 80;

    public void centigradosAFharenheit(float cent) throws TemperaturaErradaExcepcion {
        double fahr = cent * 1.8 + 32.4;
        if (cent < Temp) {
            throw new TemperaturaErradaExcepcion();
        } else {
            System.out.println("Conversión a Fahrenheit: " + fahr);
        }
    }

    public void centígradosAReamur(float cent) throws TemperaturaErradaExcepcion {
        double ream = 0.8 * cent;
        if (cent < Temp) {
            throw new TemperaturaErradaExcepcion();
        } else {
            System.out.println("Conversión a Reaumur: " + ream);
        }

    }

}
