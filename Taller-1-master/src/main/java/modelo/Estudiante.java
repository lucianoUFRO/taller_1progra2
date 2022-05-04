
package modelo;

public class Estudiante {
    
    //Atributos Persona
    private String Nombre;
    private String Matricula;
    private String Carrera;
    private String Correo;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Matricula, String Carrera, String Correo) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Matricula=" + Matricula + ", Carrera=" + Carrera + ", Correo=" + Correo + '}';
    }
    
    
}


     
       