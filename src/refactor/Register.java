package refactor;

import java.util.Scanner;

/**
 * Controller que registra un Patient
 */
public final class Register implements Controller {
    private final Scanner scanner;

    public Register(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getDescription() {
        return "Registrar paciente";
    }

    @Override
    public void run(Matrix matrix) {
        final Patient patient = new Patient();
        fillPatient(patient);
        matrix.save(patient);
    }

    private void fillPatient(Patient patient) {
        System.out.println("Modulo para Ingresar ");
        System.out.println("*****************");
        System.out.println("RUT: ");
        patient.setRut(scanner.next());
        System.out.println("Nombre del paciente: ");
        patient.setName(scanner.next());
        System.out.println("Apellido del paciente: ");
        patient.setLastName(scanner.next());
        System.out.println("Tipo de Consulta: ");
        patient.setVisitType(scanner.next());
        System.out.println("Fecha de Ingreso: ");
        patient.setCheckinDate(scanner.next());
        System.out.print("Minutos en consulta: ");
        patient.setVisitDuration(scanner.nextInt());
    }
}
