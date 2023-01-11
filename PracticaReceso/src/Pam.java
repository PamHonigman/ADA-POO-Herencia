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
        System.out.println("Hable más fuerte que tengo una toalla");
    }

    @Override
    public String toString() {
        return "Pam: " +
                "\nEdad = " + edad +
                "\nComidaFavorita = " + comidaFavorita +
                "\n" + super.toString();
    }


}
