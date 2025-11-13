import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicios {
    //EJERCICIO 1. Listar archivos de un directorio.
    public void infoDirectorios(String path){
        File file = new File(path);
        System.out.println("El nombre de la carpeta/fichero es: "+file.getName());
        if (file.isDirectory()){
            for (File item:file.listFiles()){
                infoDirectorios(item.getPath());
            }
        }
    }
    //EJERCICIO 2. Leer Archivo texto.
    public void leerArchivo(String path){
        File file = new File(path);
        FileReader reader = null;

        try {
            reader = new FileReader(file);
            int lectorCodigo = 0;
            while ((lectorCodigo = reader.read()) != -1){
                System.out.println((char) (lectorCodigo/5));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try{
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //EJERCICIO 3 Buscar palabra en una rchivo
    //EJERCICIO 4 Copiar un archivo
    //EJERCICIO 5 Obtener info de un archivo
    //EJERCICIO 6 Contar lineas de un archivo
    //EJERCICIO 7 Crear un CSV Simple
    //-------------------2nda Parte--------------
    //EJERCICIO 1 Exploración básica con File
    //EJERCICIO 2 Contador de palabras
    //EJERCICIO 3 Editor Texto Simple
    //EJERCICIO 4 Fusióna rchivos de texto
    //EJERCICIO 5 Sistema de registro login
    //EJERCICIO 6 Serialización de agenda de contactos
    //EJERCICIO 7 Sistema de inventario
    //Ejercicio 8 Conversión entre formatos de archivos





}
