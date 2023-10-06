package ENUM;

public enum Transporte {
BUS(30 , "motor diesel"){
    public String mostrarCapacidad() {
        return "30";
    }
},
TREN(1500 , "motor de corriente continua"){
    public String mostrarCapacidad() {
        return "1500";
    }
},
BARCO(5000 , "motor de diesel marino"){
    public String mostrarCapacidad() {
        return "5000";
    }
},
MOTO(2 , "motor de 6 cilindros "){
    @Override
    public String mostrarCapacidad() {
        return "2";
    }
},
AVION(1100 , "motor de piston"){
    @Override
    public String mostrarCapacidad() {
        return "1100";
    }
};
private int capacidad;
private String tipodemotor;

Transporte(int capacidad, String tipodemotor){
    this.capacidad = capacidad;
    this.tipodemotor = tipodemotor;
}

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipodemotor() {
        return tipodemotor;
    }
    public abstract String mostrarCapacidad();

}
