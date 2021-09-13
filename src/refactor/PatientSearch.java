package refactor;

import java.util.Scanner;

/**
 * Controller que busca e imprime Patient
 */
public final class PatientSearch implements Controller {
    private final Scanner scanner;

    public PatientSearch(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getDescription() {
        return "Buscar por RUT";
    }

    @Override
    public void run(Matrix matrix) {
        System.out.print("Ingrese el Rut del paciente a buscar : ");
        final String rut = scanner.next();
        final Patient patient = matrix.getByRut(rut);
        // que pasa si no lo encontramos ?
        if (patient != null) {
            patient.show();
        } else {
            System.out.println("No encontré nada");
        }
    }
}
