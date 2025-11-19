package unidad3.arryse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

//Escribe un programa que extraiga todas las URLs
//que comiencen por http:// o https:// contenidas en
//un documento HTML almacenado en un fichero. La ruta
//de acceso al fichero se especificará en un
//parámetro de línea de comando.


public class Ejercicio4 {

	public static void main(String[] args) {
		HttpsURLConnection con = null; 

        if (args.length != 1) {
            System.out.println(" java ExtraerURLs <ruta_fichero>");
            return;
        }

        String rutaFichero = args[0];
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("LRU.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return;
        }

    
        Pattern patron = Pattern.compile("(https?://[^\\s\"'>]+)");
        Matcher matcher = patron.matcher(contenido.toString());

        List<String> urls = new ArrayList<>();
        while (matcher.find()) {
            urls.add(matcher.group());
        }

        System.out.println("URLs encontradas:");
        for (String url : urls) {
            System.out.println(url);

	}
	}
}


