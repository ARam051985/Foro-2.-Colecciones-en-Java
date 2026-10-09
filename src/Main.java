import java.util.Vector;

public class Main {
    public static void imprimirAlumnos(Vector<Alumno> alumnos) {
        // For each para recorrer el vector
        for(Alumno alumno : alumnos) {
            System.out.printf("Nombre del alumno: %s\n", alumno.getNombre());
            System.out.printf("Edad: %d años\n", alumno.getEdad());
            System.out.printf("Matrícula del alumno: %s\n\n", alumno.getMatricula());
        }

        /* For tradicional para recorrer el vector
        for(int i = 0; i < alumnos.size(); i++) {
            System.out.printf("Nombre del alumno: %s\n", alumnos.get(i).getNombre());
            System.out.printf("Edad: %d años\n", alumnos.get(i).getEdad());
            System.out.printf("Matrícula del alumno: %s\n\n", alumnos.get(i).getMatricula());
        }
         */
    }

    public static void main(String[] args) {
        Vector<Alumno> alumnos = new Vector<>();

        // 3 alumnos creados
        Alumno alumno1 = new Alumno("Tejeda Jiménez Alan Yahir", 19, "M-001");
        Alumno alumno2 = new Alumno("Manzano", 24, "M-002");
        Alumno alumno3 = new Alumno("Aitana Valencia", 21, "M-003");

        // Se añaden los 3 alumnos al vector
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        // Se quitan los 2 primeros alumnos del vector
        alumnos.remove(alumno1);
        alumnos.remove(alumno2);

        // Se imprimen los alumnos
        imprimirAlumnos(alumnos);
    }
}