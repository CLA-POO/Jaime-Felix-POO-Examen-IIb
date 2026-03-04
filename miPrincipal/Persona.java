package miPrincipal;

// Persona.java
// Clase para implementar un objeto Persona y su indice de masa corporal (IMC)

public class Persona {
    private String nombre;
    private int edad;
    private char genero;
    private double peso; // en kilogramos
    private double altura; // en metros

    // Constructor
    public Persona(String nombre, int edad, char genero, double peso, double altura) {
        // Mandar llamar a los metodos set de los atributos
    }

    // Metodos set/get
    public void setNombre(String nombre) {
        // El nombre no se valida
    }

    public void setEdad(int edad) {
        // La edad debe ser mayor o igual a 0
    }

    public void setGenero(char genero) {
        // El genero debe ser 'M' o 'F'
    }

    public void setPeso(double peso) {
        // El peso debe ser mayor o iguala 0
    }

    public void setAltura(double altura) {
        // La altura debe ser mayor o igual a 0
    }

    public String getNombre() {
        return "";
    }

    public int getEdad() {
        return 0;
    }

    public char getGenero() {
        return '\0';
    }

    public double getPeso() {
        return 0.0;
    }

    public double getAltura() {
        return 0.0;
    }

    // Metodo para calcular el indice de masa corporal (IMC)
    public double calcularIMC() {
        return 0;
    }

    // Metodo para determinar la categoria del IMC
    public String categoriaIMC() {
        return "";
    }

    // Sobrescribir el metodo toString para mostrar la informacion de la persona
    @Override
    public String toString() {
        String resultado =  String.format("Persona: %s, Edad: %d, Genero: %c, Peso: %.2f kg, Altura: %.2f m",
                nombre, edad, genero, peso, altura);
        return resultado;
    }
}
