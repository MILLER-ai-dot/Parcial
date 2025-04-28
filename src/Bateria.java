public class Bateria {
    private int carga=1000;

    public Bateria() {
    }

    public Bateria(int carga) {
        this.carga = carga;
        carga = 1000;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "carga=" + carga +
                '}';
    }
}
