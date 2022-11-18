public class Iphone extends Telefono{

    public Iphone(String marca) {
        super(marca);
    }

    @Override
    public void consumoBateria(int duracionLlamada) {
        setBateria(getBateria()-duracionLlamada*0.01);
    }
}
