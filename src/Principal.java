
import java.util.Scanner;
public class Principal {

    public static  void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        Matriz ingresos = new Matriz();
        Ingreso ingresar = new Ingreso();
        Buscar busca = new Buscar();

        do {
            System.out.println("********************");
            System.out.println("****** Menu Principal ******");
            System.out.println("********************");
            System.out.println("1.- Agregar cantidad de pacientes");
            System.out.println("2.- Llenar datos de pacientes");
            System.out.println("3.- Buscar por Rut");
            System.out.println("4.- Verificar cantidad de Visitas realizadas por el paciente");
            System.out.println("5.- Salir");
            System.out.println("Ingrese su Opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    ingresos.setPatients();
                    break;

                case 2:

                    ingresar.newInput();
                    break;
                case 3:

                    busca.getPatient();
                    break;
                default:
                    break;
            }

//fin main
        }while (opc != 5);

//fin class
    }
}



