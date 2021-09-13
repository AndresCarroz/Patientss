package refactor;

import java.util.Scanner;

/**
 * Controller que finaliza todo el programa.
 */
public final class Exit implements Controller {
    private final Scanner scanner;

    public Exit(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getDescription() {
        return "Salir";
    }

    @Override
    public void run(Matrix matrix) {
        System.out.println("Adios");
        System.exit(0);
    }
}
