public class Robot {
    Bateria bateria = new Bateria();
    boolean dormido = false;

    public Robot() {
    }

    public Robot(Bateria bateria, boolean dormido) {
        this.bateria = bateria;
        this.dormido = dormido;
    }

    public void avanzar(int pasos){
        int Pasos = pasos;
        int resta = (int) (Pasos*0.1);
        int bat = bateria.getCarga();
        int resta2 = bat-resta;
        bateria.setCarga(resta2);
    }

    public void retroceder(int pasos){
        int Pasos = pasos;
        int resta = (int) (Pasos*0.1);
        int bat = bateria.getCarga();
        int resta2 = bat-resta;
        bateria.setCarga(resta2);
    }

    public void dormir(){
        dormido = true;
    }

    public void despertar(){
        dormido = false;
    }

    public void recargar(){
        bateria.setCarga(1000);
    }

    public boolean bateriaLlena(){
       if (bateria.getCarga() == 1000){
           return true;
       }else return false;
    }

    public boolean bateriaVacia(){
        if (bateria.getCarga() == 0){
            return true;
        }else return false;
    }

    public int  energiaActual(){
        return bateria.getCarga();
    }

    public boolean estaDormido(){
        if (dormido){
            return true;
        }else return false;
    }


    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "bateria=" + bateria +
                ", dormido=" + dormido +
                '}';
    }
}
