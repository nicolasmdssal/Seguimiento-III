package mascota;

public class Mascota {

    private String nombre;
    private int edad;
    private String raza;
    private String color;

    public Mascota(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Neron", 3, "Golden Retriever", "dorado");
        Mascota mascota2 = new Mascota("Firulais", 14, "Persa", "Azul");
        Mascota mascota3 = new Mascota("Zeus", 4, "Pitbull", "Tricolor");

        System.out.println("Mascota 1: Nombre - " + mascota1.getNombre() + ", Edad - " + mascota1.getEdad() + ", Raza - " + mascota1.getRaza() + ", Color - " + mascota1.getColor());
        System.out.println("Mascota 2: Nombre - " + mascota2.getNombre() + ", Edad - " + mascota2.getEdad() + ", Raza - " + mascota2.getRaza() + ", Color - " + mascota2.getColor());
        System.out.println("Mascota 3: Nombre - " + mascota3.getNombre() + ", Edad - " + mascota3.getEdad() + ", Raza - " + mascota3.getRaza() + ", Color - " + mascota3.getColor());

        // Modificar los valores de los atributos de la mascota 1
        mascota1.setNombre("Julio");
        mascota1.setEdad(5);
        mascota1.setRaza("Pastor Alemán");
        mascota1.setColor("Negro");

        System.out.println("Mascota 1 (modificado): Nombre - " + mascota1.getNombre() + ", Edad - " + mascota1.getEdad() + ", Raza - " + mascota1.getRaza() + ", Color - " + mascota1.getColor());
    }
}
