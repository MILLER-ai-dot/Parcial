import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner t = new Scanner(System.in);
        List<Robot> robot = new ArrayList<>();
        List<Hombre> hombre = new ArrayList<>();
        do {
            System.out.println("""
                    --------------------------------
                    >> Juega con nuestros Robots <<
                    --------------------------------
                    1)Genera un amigo robot
                    2)Inscribete 
                    3)Selecciona Jugador
                    4)Salir
                    --------------------------------
                    """);
            opc = t.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Generaste un robot");
                    robot.add(new Robot());
                    System.out.println("""
                            *Recuerda despertar a tu robot 
                            y verificar su bateria para poder jugar con el*
                            """);
                }
                case 2 -> {
                    String nombre;
                    System.out.println("Digita tu nombre: ");
                    nombre = t.next();
                    System.out.println("Te registraste");
                    hombre.add(new Hombre(nombre));
                    System.out.println("""
                            *ahora puedes seleccionar este  jugador*
                            """);
                }
                case 3 -> {
                    String nombre;
                    System.out.println("Digita tu nombre: ");
                    nombre = t.next();
                    for (Hombre e: hombre){
                        if (e.getNombre().equals(nombre)){
                            for(Robot r : robot){
                               e.jugarConRobot(r);
                            }

                        }

                    }


                }
                case 4 -> {
                    System.out.println("Cerrando...");
                }
                default -> System.out.println("//Ingrese una opcion correcta//");
            }
        } while (opc != 4);
    }
}