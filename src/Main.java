public class Main {
    public static void main(String[] args) {
        int num1 = 1; // Ejercicio 1
        int num2 = 2; // Ejercicio 1
        int num3 = 3; // Ejercicio 1
        int resultado = suma(num1, num2, num3); // Ejercicio 1

        Coche miCoche = new Coche(); // Ejercicio 2
        miCoche.sumarPuertas();// Ejercicio 2

        System.out.println("El resultado es "+resultado); // Ejercicio 1
        System.out.println("La cantidad de puertas del Coche es : " +miCoche.sumarPuertas);// Ejercicio 2
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;//// Ejercicio 1
    }

}