package refactor;

/**
 * Cada acción es manejada por un controller
 */
public interface Controller {

    /**
     * Descripción de lo que hace este controller
     * @return descripcion
     */
    String getDescription();

    /**
     * Ejecuta el controller
     * @param matrix para tener acceso a los Patient
     */
    void run(Matrix matrix);
}
