package problema02;

public class Calificacion {

    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Calificacion(String nomb, String apelli, double cali1, double cali2,
            double cali3) {
        nombre = nomb;
        apellido = apelli;
        calificacion1 = cali1;
        calificacion2 = cali2;
        calificacion3 = cali3;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCalificacion1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacion2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacion3(double c) {
        calificacion3 = c;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n"
                + "  \tCalificaciones:\n"
                + "  \t%.2f\n"
                + "  \t%.2f\n"
                + "  \t%.2f\n"
                + "  \tPromedio: %.2f\n",
                nombre,
                apellido,
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                promedio);
        return cadena;

    }
}
