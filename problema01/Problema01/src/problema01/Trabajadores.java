package problema01;

public class Trabajadores {

    private String cedula;
    private String nombre;
    private String correo;
    private double salario;
    private int mesSalario;

    public Trabajadores(String id, String nomb, String mail, double sueldo,
            int mesSueld) {
        cedula = id;
        nombre = nomb;
        correo = mail;
        salario = sueldo;
        mesSalario = mesSueld;
    }

    public void establecerCedula(String id) {
        cedula = id;
    }

    public void establecerNombre(String nomb) {
        nombre = nomb;
    }

    public void establecerCorreo(String mail) {
        correo = mail;
    }

    public void establecerSalario(double sueldo) {
        salario = sueldo;
    }

    public void establecerMesSalario(int mesSueld) {
        mesSalario = mesSueld;
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

    public double obtenerSalario() {
        return salario;
    }

    public int obtenerMesSalario() {
        return mesSalario;
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
                obtenerSalario(),
                obtenerMesSalario());
        return cadena;
    }
}
