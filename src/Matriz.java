import java.util.Scanner;
public class Matriz {
    int n;
    Scanner sc = new Scanner(System.in);
    public Paciente[] setPatients() {
       System.out.println("Bienvenidos al Sistema de Consultas, agregue cantidad de pacientes agendados: ");
        n = sc.nextInt();
        return new Paciente[n];
    }
}
