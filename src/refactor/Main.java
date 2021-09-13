package refactor;

import java.util.Scanner;

/**
 * Clase que contiene el main a ejecutar
 */
public final class Main {
    public static void main(String[] args) {
        // usamos solo 1 scanner
        final Scanner scanner = new Scanner(System.in);

        // se encarga de almacenar pacientes
        final Matrix matrix = new MapMatrix();

        // controllers
        final Controller register = new Register(scanner);
        final Controller patientSearch = new PatientSearch(scanner);
        final Controller exit = new Exit(scanner);

        // programa pricipal
        final PatientManagement patientController = new PatientManagement(matrix, scanner);
        patientController.addController(1, register);
        patientController.addController(2, patientSearch);
        patientController.addController(3, exit);

        patientController.start();
    }
}
