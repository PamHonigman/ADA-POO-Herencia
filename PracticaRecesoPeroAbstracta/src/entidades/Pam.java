package entidades;

public class Pam extends Persona{
    protected int edad;
    protected String comidaFavorita;

    public Pam(){
    }

    public Pam(int edad, String comidaFavorita) {
        this.edad = edad;
        this.comidaFavorita = comidaFavorita;
    }

    public Pam(String nombre, String apellido, int edad, String comidaFavorita) {
        super(nombre, apellido);
        this.edad = edad;
        this.comidaFavorita = comidaFavorita;
    }

    @Override
    public void saludar() {
        System.out.println("Nombre = " + nombre + "\nApellido = " + apellido + "\nEdad = " + edad +
                "\nComidaFavorita = " + comidaFavorita);
        System.out.println("\"Hable más fuerte que tengo una toalla\"");
    }
}
