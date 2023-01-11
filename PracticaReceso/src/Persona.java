public class Persona {
    protected String nombre;
    protected String apellido;

    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void saludar(){
        System.out.println("Holas que vienen, holas que van!");
    }

    @Override
    public String toString() {
        return "Persona: " +
                "\nNombre = " + nombre +
                "\nApellido = " + apellido;
    }
}
