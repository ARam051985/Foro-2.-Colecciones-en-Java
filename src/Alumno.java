public class Alumno {
    private String nombre;
    private int edad;
    private String matricula;

    public Alumno(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {return this.nombre;}
    public int getEdad() {return this.edad;}
    public String getMatricula() {return this.matricula;}
}
