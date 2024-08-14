package gestionAcademica;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int grado;
    private int edad;
    private double promedioAcademico;
    private String nombrePadre;
    private String nombreMadre;
    public int telefonoPadres[] = new int[2];

    public Estudiante (String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombrePadre, String nombreMadre){
        this.nombres  = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }

    public Estudiante (String nombres, String apellidos, int grado, int edad, double promedioAcademico, String nombrePadre, String nombreMadre, int telefonoPadres[]){
        this.nombres  = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
        this.telefonoPadres = telefonoPadres;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getGrado() {
        return grado;
    }

    public int getEdad() {
        return edad;
    }

    public int getPromedioAcademico() {
        return edad;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = apellidos;
    }

    public void setGrado(int grado){
        this.grado = grado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public void setNombrePadre(String nombrePadre){
        this.nombrePadre = nombrePadre;
    }

    public static void main(String[] args) {
        var Estuidante1 = new Estudiante( "juan", "Naranjo Ruiz", 7, 13, 3.9, "marcos", "Juana");
        var Estuidante2 = new Estudiante( "Felipe", "Mendoza Del Castillo", 11, 17, 4.3, "Pedro", "Xiomara");
        var Estuidante3 = new Estudiante( "Camilo", "Murillo", 4, 6, 3.1, "Mateo", "Gloria");

        System.out.println("Estuidante1 = Nombre : " + Estuidante1.getNombres() + "; Apellidos : " + Estuidante1.getApellidos() + "; grado : " + Estuidante1.getGrado() + "; edad : " + Estuidante1.getEdad() +
                "; promedio academico : " + Estuidante1.getPromedioAcademico() + "; nombre del padre : " + Estuidante1.getNombrePadre() + "; nombre de la madre : " + Estuidante1.getNombreMadre());
        System.out.println("Estuidante2 = Nombre : " + Estuidante2.getNombres() + "; Apellidos : " + Estuidante2.getApellidos() + "; grado : " + Estuidante2.getGrado() + "; edad : " + Estuidante2.getEdad() +
                "; promedio academico : " + Estuidante2.getPromedioAcademico() + "; nombre del padre : " + Estuidante2.getNombrePadre() + "; nombre de la madre : " + Estuidante2.getNombreMadre());
        System.out.println("Estuidante3 = Nombre : " + Estuidante3.getNombres() + "; Apellidos : " + Estuidante3.getApellidos() + "; grado : " + Estuidante3.getGrado() + "; edad : " + Estuidante3.getEdad() +
                "; promedio academico : " + Estuidante3.getPromedioAcademico() + "; nombre del padre : " + Estuidante3.getNombrePadre() + "; nombre de la madre : " + Estuidante3.getNombreMadre());
    }
}
