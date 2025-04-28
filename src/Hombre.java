import java.util.Scanner;

public class Hombre {
    private String Nombre;

    public Hombre() {
    }

    public Hombre(String nombre) {
        Nombre = nombre;
    }

    public void jugarConRobot(Robot robot){
        int opc;

        Scanner t = new Scanner(System.in);
        do {
            System.out.println("""
                    --------------------------------------
                    >>Juega con tu robot<<
                    --------------------------------------
                    1)Avanza
                    2)Retrocede
                    3)ver energia actual
                    4)Dormir al robot(finaliza tu secion)
                    5)Despertar al robot
                    6)Recargar bateria
                    ----------------------------------------
                    """);
            opc = t.nextInt();
            switch (opc) {
                case 1 -> {
                    int pasos;
                    System.out.println("Ingresa cantidad de pasos que quieres avanzar: ");
                    pasos = t.nextInt();
                    robot.avanzar(pasos);
                }
                case 2 -> {
                    int pasos;
                    System.out.println("Ingresa cantidad de pasos que quieres retroceder: ");
                    pasos = t.nextInt();
                    robot.retroceder(pasos);
                }
                case 3 -> {
                    System.out.println(robot.energiaActual());
                }
                case 4 -> {
                    robot.dormir();
                }
                case 5 -> {
                    robot.despertar();
                }
                case 6 -> {
                    robot.recargar();
                }
            }
        }while (opc!=4);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Hombre{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
