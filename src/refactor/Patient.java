package refactor;

/**
 * Representación de un paciente
 */
public class Patient {
    private String name;
    private String lastName;
    private String rut;
    private String visitType;
    private String checkinDate;
    private int visitDuration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public int getVisitDuration() {
        return visitDuration;
    }

    public void setVisitDuration(int visitDuration) {
        this.visitDuration = visitDuration;
    }

    public void show() {
        System.out.println("Rut Paciente : " + getRut());
        System.out.println("Nombre del Paciente  : " + getName() + " " + getLastName());
        System.out.println("Fecha Ingreso del Paciente : " + getCheckinDate());
        System.out.println("Tipo de Consulta que asiste : " + getVisitType());
        System.out.println("Duración de la consulta: " + getVisitDuration() + " minutos. ");
    }
}
