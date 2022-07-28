package problema01;

public class Trabajadores {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajadores(String cedu, String nomb, String corre, double sueld,
            String mesSueld) {
        cedula = cedu;
        nombre = nomb;
        correo = corre;
        sueldo = sueld;
        mesSueldo = mesSueld;
    }

    public void establecerCedula(String cedu) {
        cedula = cedu;
    }

    public void establecerNombre(String nomb) {
        nombre = nomb;
    }

    public void establecerCorreo(String corre) {
        correo = corre;
    }

    public void establecerSueldo(double sueld) {
        sueldo = sueld;
    }

    public void establecerMesSueldo(String mesSueld) {
        mesSueldo = mesSueld;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Mes del Sueldo: s\n",
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());
        return cadena;
    }
}
