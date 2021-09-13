package refactor;

/**
 * Se encarga de almacenar y acceder a los Patient
 */
public interface Matrix {

    /**
     * Guarda un Patient
     * @param patient para guardar
     * @return el id
     */
    int save(Patient patient);

    /**
     * Busca un Patient por rut
     * @param rut rut de un Patient
     * @return Patient encontrado o null
     */
    Patient getByRut(String rut);
}
