import java.util.Scanner;
public class Buscar extends Ingreso {
   Scanner sc = new Scanner(System.in);
 Ingreso ingresar = new Ingreso();


    public void getPatient(){
        Paciente[] patients = ingresar.newInput();
        System.out.print("Ingrese el Rut del paciente a buscar : ");
        int c = sc.nextInt();
        for (int i = 0; i < patients.length; i++)
        if (patients[i].getId() == c)
            patients[i].Mostrar();

    }
 }