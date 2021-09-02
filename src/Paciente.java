
public class Paciente
{ private int id;
    private int min;
    private int cant;
  private String nom;
    private String ap;
    private String tipCon;
  private String feIng;


    public Paciente() {

    }




    public void Mostrar()
 {
   System.out.println("Rut Paciente : " + getId());
   System.out.println("Nombre del Paciente  : " + getNom() + " " + getAp());
   System.out.println("Fecha Ingreso del Paciente : " + getFeIng());
   System.out.println("Tipo de Consulta que asiste : " + getTipCon());
   System.out.println("Duración de la consulta: " + getMin() + " minutos. ");

 }
 public void visitas(){
      System.out.println("El paciente ha realizado la siguiente cantidad de visitas: " + getCant());
 }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getTipCon() {
        return tipCon;
    }

    public void setTipCon(String tipCon) {
        this.tipCon = tipCon;
    }

    public String getFeIng() {
        return feIng;
    }

    public void setFeIng(String feIng) {
        this.feIng = feIng;
    }
}

