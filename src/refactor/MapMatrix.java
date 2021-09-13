package refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * Se encarga de almacenar y acceder a los Patient
 */
public final class MapMatrix implements Matrix {

    final Map<Integer, Patient> patientMap = new HashMap<>();

    @Override
    public int save(Patient patient) {
        int nextId = patientMap.size();
        patientMap.put(nextId, patient);
        return nextId;
    }

    @Override
    public Patient getByRut(String rut) {
        for (Map.Entry<Integer, Patient> entry : patientMap.entrySet()) {
            Patient patient = entry.getValue();
            if (patient.getRut().equals(rut)) {
                return patient;
            }
        }
        // que pasa si no encontramos un paciente?
        return null;
    }
}
