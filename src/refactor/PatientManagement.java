package refactor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Proceso encargado de manejar acciones sobre un Patient.
 * Estas acciones son definidas por Controllers.
 */
public final class PatientManagement {
    private final Matrix matrix;
    private final Scanner scanner;
    private final Map<Integer, Controller> controllers = new HashMap<>();

    public PatientManagement(Matrix matrix, Scanner scanner) {
        this.matrix = matrix;
        this.scanner = scanner;
    }

    public void addController(int key, Controller controller) {
        controllers.put(key, controller);
    }

    public void start() {
        welcomeMessage();
        // cuando paramos?
        while (true) {
            showDivider();
            final int key = askForKey();
            runController(key);
        }
    }

    private void welcomeMessage() {
        System.out.println("********************");
        System.out.println("** Menu Principal **");
        System.out.println("********************");
    }

    private void showDivider() {
        System.out.println("====================");
    }

    private int askForKey() {
        showControllers();
        System.out.println("Ingrese su Opcion: ");
        return scanner.nextInt();
    }

    private void showControllers() {
        for (Map.Entry<Integer, Controller> entry : controllers.entrySet()) {
            final int controllerKey = entry.getKey();
            String controllerDescription = entry.getValue().getDescription();
            System.out.println(String.format("%s.- %s", controllerKey, controllerDescription));
        }
    }

    private void runController(int key) {
        controllers.get(key).run(matrix);
    }
}
