package boletin14;

public class Boletin14 {

    public static void main(String[] args) {
        ConversorTemperaturas obj = new ConversorTemperaturas();
        try {
            obj.centigradosAFharenheit(79);
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println(e.toString());
        }
        obj.centígradosAReamur(79);

    }

}
