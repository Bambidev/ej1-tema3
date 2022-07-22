public class Main {

    public static void main(String[] args) {
        suma(50,50,40);

        coche miChoche = new coche();
        miChoche.agregarPuerta();
        System.out.println("Cantidad de puertas: "+ miChoche.puertas);
    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b +c;
        System.out.println(resultado);
    }
}

class coche {
    public int puertas = 4;
    public void agregarPuerta() {
        this.puertas++;
    }
}