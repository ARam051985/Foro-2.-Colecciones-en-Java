public class Alumno {
    private String nombre;
    private int edad;
    private String matricula;

    public Alumno(String nombre, int edad, String matricula) {
        setNombre(nombre);
        setEdad(edad);
        setMatricula(matricula);
    }

    public String getNombre() {return this.nombre;}
    public int getEdad() {return this.edad;}
    public String getMatricula() {return this.matricula;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
}

