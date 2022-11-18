public class Persona {

    String nombre;

    Telefono telefono;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, Telefono telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void llamar(Persona persona, int duracionLlamada){
        persona.telefono.consumoBateria(duracionLlamada);
        this.telefono.consumoBateria(duracionLlamada);
    }
}
