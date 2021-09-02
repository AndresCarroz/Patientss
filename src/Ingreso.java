import java.util.Scanner;
public class Ingreso {

    Scanner sc = new Scanner(System.in);
    int x;
Matriz input = new Matriz();

    public Paciente[] newInput(){
        Paciente[] patients = new Paciente[input.setPatients()];
        System.out.println("Modulo para Ingresar ");
        x = sc.nextInt();
        for (int i = 0; i < patients.length; i++)
    {
        System.out.println("*****************");
        System.out.println("Pacientes: " + i);
        patients[i] = new Paciente();
        System.out.println("RUT: ");
        patients[i].setId(sc.nextInt());
        System.out.println("Nombre del paciente: ");
        patients[i].setNom(sc.next());
        System.out.println("Apellido del paciente: ");
        patients[i].setAp(sc.next());
        System.out.println("Tipo de Consulta: ");
        patients[i].setTipCon(sc.next());
        System.out.println("Fecha de Ingreso: ");
        patients[i].setFeIng(sc.next());
        System.out.print("Minutos en consulta: ");
        patients[i].setMin(sc.nextInt());

    }

        return patients;
    }

}
