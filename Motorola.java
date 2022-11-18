public class Motorola extends Telefono{

    public Motorola(String marca) {
        super(marca);
    }

    @Override
    public void consumoBateria(int duracionLlamada) {
        setBateria(getBateria()-0.0025);
    }
}
