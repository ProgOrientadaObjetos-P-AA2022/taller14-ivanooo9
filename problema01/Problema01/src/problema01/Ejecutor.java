package problema01;

import java.util.Locale;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Enlace c = new Enlace();
        Scanner entrada = new Scanner(System.in);
        String res;
        entrada.useLocale(Locale.US);
        do {
            System.out.println("Ingrese la cedula del trabajador: ");
            String id = entrada.nextLine();
            System.out.println("Ingrese el nombre del trabajador: ");
            String nomb = entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador: ");
            String mail = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador: ");
            double sueldo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes que trabajo:");
            int mesSueld = entrada.nextInt();

            Trabajadores trabajador1 = new Trabajadores(id, nomb, mail, sueldo,
                    mesSueld);
            c.insertarTrabajador(trabajador1);
            //entrada.nextLine();
            System.out.println("Ponga si, para ingresar otro trabajador15: ");
            res = entrada.nextLine().toLowerCase();
        } while (res.equals("si"));
    }

}
