package ENUM;

public class Main {
    public static void main(String[] args) {
        Transporte bus = Transporte.BUS;
        Transporte tren = Transporte.TREN;
        Transporte barco = Transporte.BARCO;
        Transporte moto = Transporte.MOTO;
        Transporte avion = Transporte.AVION;

        System.out.println("capacidad: " + bus.getCapacidad());
        System.out.println("tipodemotor: " + bus.getTipodemotor());

        System.out.println("capacidad: " + tren.getCapacidad());
        System.out.println("tipodemotor: " + tren.getTipodemotor());

        System.out.println("capacidad: " + barco.mostrarCapacidad());
        System.out.println("tipodemotor: " + barco.getTipodemotor());

        System.out.println("capacidad: " + moto.mostrarCapacidad());
        System.out.println("tipodemotor: " + moto.mostrarCapacidad());

        System.out.println("capaciadad: " + avion.getCapacidad());
        System.out.println("tipodemotor: " + avion.getTipodemotor());
    }
}
