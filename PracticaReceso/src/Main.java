public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pam", "Honigman");
        System.out.println(persona1);
        persona1.saludar();

        System.out.println("");

        Pam pam = new Pam("Pam", "Honigman", 33, "Pizza" );
        System.out.println(pam);
        pam.saludar();
    }
}