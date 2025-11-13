public class Main {
    public static void main(String[] args){
        Ejercicios ejercicios = new Ejercicios();
        //Ejercicio 1.1
        ejercicios.infoDirectorios("src/resources");
        //Ejercicio 1.2
        ejercicios.leerArchivo("src/resources/bitacora.txt");
        //Ejercicio 1.3
        ejercicios.buscadorPalabra("src/resources/bitacora.txt", "de");
        //Ejercicio 1.5
        ejercicios.informacion("src/resources/bitacora.txt");

        //Ejercicio 2.2
        ejercicios.contarPalabras("src/resources/bitacora.txt");

    }
}
