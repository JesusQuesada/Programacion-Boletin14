package boletin14;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {

        super("La temperatura no puede ser menor de 80 grados ");

    }

    public TemperaturaErradaExcepcion(String s) {

        super(s);
    }

    /*public void errorTemp(float cent) throws TemperaturaErradaExcepcion {
     if (cent < 80) {
     throw new TemperaturaErradaExcepcion();
     }
     }*/
}
