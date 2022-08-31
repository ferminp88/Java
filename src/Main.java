public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int resultado = suma(num1, num2, num3);

        System.out.println("El resultado es "+resultado);
        System.out.println("La cantidad de puertas del Coche es : " +miCoche.sumarPuertas);
    }

    public static int suma(int num1, int num2, int num3) {

        return num1 + num2 + num3;

    }

}