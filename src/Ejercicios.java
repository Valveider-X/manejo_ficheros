import java.io.*;

public class Ejercicios {
    //EJERCICIO 1.1. Listar archivos de un directorio.
    public void infoDirectorios(String path){
        File file = new File(path);
        System.out.println("El nombre de la carpeta/fichero es: "+file.getName());
        if (file.isDirectory()){
            for (File item:file.listFiles()){
                infoDirectorios(item.getPath());
            }
        }
    }
    //EJERCICIO 1.2. Leer Archivo texto.
    public void leerArchivo(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String linea;
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe o no se puede abrir");;
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");;
        }
    }
    //EJERCICIO 1.3 Buscar palabra en un archivo
    public void buscadorPalabra(String path, String palabra){
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String linea;
            //leemos hasta que devuelve null
            while((linea = reader.readLine()) !=null){
                //convertimos tanto las lineas como las palabras a minusculas
                String lineaMinuscula = linea.toLowerCase();
                String palabraMinuscula = palabra.toLowerCase();
                //ojo con este, con split separamos, con \\W+ separamos lo que no sea letras o numeros, comas, puntos, espacios..
                String[] palabras = lineaMinuscula.split("\\W+");

                for(String p : palabras){
                    if(p.equals(palabraMinuscula)){
                        //contamos la palabra con un bucle for sencillito
                        contador++;
                    }
                }
            }
            System.out.println("La palabra \"" +palabra + "\" aparece "+contador+ " veces en el documento.");
        } catch (IOException e) {
            System.out.println("Error al leer archivo");;
        }
    }
    //EJERCICIO 1.4 Copiar un archivo
    //EJERCICIO 1.5 Obtener info de un archivo
    public void informacion(String path){
        File file = new File(path);
        System.out.println("Es un directorio: "+file.isDirectory());
        System.out.println("Es un fichero: "+file.isFile());
        System.out.println("El archivo existe: "+file.exists());
        System.out.println("El archivo se puede escribir: "+file.canWrite());
        System.out.println("El archivo se puede leer: "+file.canRead());
        System.out.println("El archivo se puede ejecutar: "+file.canExecute());

    }
    //EJERCICIO 1.6 Contar lineas de un archivo
    //EJERCICIO 1.7 Crear un CSV Simple
    //-------------------2nda Parte--------------
    //EJERCICIO 2.1 Exploración básica con File
    //EJERCICIO 2.2 Contador de palabras
    public void contarPalabras(String path){
        int contadorPalabras = 0;
        int contadorCaracteres = 0;
            //este booleano es para saber si esta iterando encima de una palabra o un espacio en blanco con el método (isWhitespace)
        boolean palabra = false;

            try {
                FileReader reader = new FileReader(path);
                int codigo;
                while ((codigo = reader.read()) != -1){
                    char caracter = (char) codigo;
                    contadorCaracteres++;

                    if(Character.isWhitespace(caracter)){
                        palabra = false;
                    }else if (!palabra){
                        contadorPalabras++;
                        palabra=true;
                    }
                }
                System.out.println("Hay "+contadorCaracteres+" caracteres en el documento y además hay "+contadorPalabras+" palabras");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");;
            }
       }
    //EJERCICIO 2.3 Editor Texto Simple
    //EJERCICIO 2.4 Fusióna rchivos de texto
    //EJERCICIO 2.5 Sistema de registro login
    //EJERCICIO 2.6 Serialización de agenda de contactos
    //EJERCICIO 2.7 Sistema de inventario
    //Ejercicio 2.8 Conversión entre formatos de archivos





}
