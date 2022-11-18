public abstract class Telefono {

    private String marca;
    private double bateria;
    boolean estado;

    public Telefono(String marca) {
        this.marca = marca;
        this.bateria = 5;
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public void cargarCelular() {
        this.setBateria(5);
    }

    public double estadoBateria() {

        return this.getBateria();
    }

    public String estadoCelular() {
        if (this.isEstado()) {
            return "El celular esta prendido";
        } else {
            return "El celular esta apagado";
        }}

    public abstract void consumoBateria(int duracionLlamada);
}

