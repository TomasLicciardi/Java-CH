package practico2;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        Persona persona1 = new Persona();
        persona1.setNombre("Tomas");
        persona1.setApellido("Martinez");

        Persona persona2 = new Persona();
        persona2.setNombre("Federica");
        persona2.setApellido("Gutierrez");

        Persona persona3 = new Persona();
        persona3.setNombre("Nicolas");
        persona3.setApellido("Gomez");

        Persona persona4 = new Persona();
        persona4.setNombre("Sofia");
        persona4.setApellido("Zarate");

        Persona persona5 = new Persona();
        persona5.setNombre("Estela");
        persona5.setApellido("Friguerio");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        personas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        personas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        System.out.println("Ordenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        personas.sort((p1,p2) -> p2.getApellido().compareTo(p1.getApellido()));
        System.out.println("Ordenado por apellido descendente:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

    }

}
