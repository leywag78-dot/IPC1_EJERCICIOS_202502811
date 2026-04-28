package tarea11;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ejercicio2 {
    
    private static final String TEXTO = 
        "UNIVERSIDAD DE SAN CARLOS DE GUATEMALA\n" +
        "Facultad de Ingenieria  Boletin Informativo 2026-04-25\n" +
        "Actividades programadas:\n" +
        "- Conferencia el 2026-05-01 a las 10:30 en el Edificio T3\n" +
        "- Examen parcial el 2026-05-15 a las 08:00 en el Edificio S11\n" +
        "- Defensa de proyecto el 2026-06-10 a las 14:30 en el Edificio T7\n" +
        "Contactos del departamento:\n" +
        "- Coordinador: coord.ipc1@ingenieria.usac.edu.gt Tel: 2418-8000\n" +
        "- Auxiliar 1: aux01_ipc1@ingenieria.usac.edu.gt Tel: 5555-1234\n" +
        "- Auxiliar 2: aux02.ipc1@gmail.com Tel: 4321-9876";
    
    
    public static void extraerFechas(){
    
        Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = pattern.matcher(TEXTO);
        
        while (matcher.find()){
        
            System.out.println("Anio: "+ matcher.group(1) +
                               "| Mes:" + matcher.group(2) +
                               "| Dia:" + matcher.group(3));                                                     
        }
    }
    
    public static void extraerCorreos() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(TEXTO);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    
    public static String censurarDatos(String texto) {
        String resultado = texto;
        
        Pattern patternCorreo = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcherCorreo = patternCorreo.matcher(resultado);
        resultado = matcherCorreo.replaceAll("[CORREO]");
        
        Pattern patternTelefono = Pattern.compile("\\d{4}-\\d{4}");
        Matcher matcherTelefono = patternTelefono.matcher(resultado);
        resultado = matcherTelefono.replaceAll("[TEL]");
        
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Metodo 1:Extraer fechas ===");
        extraerFechas();
        
        System.out.println("\n=== Metodo 2:Extraer correos ===");
        extraerCorreos();
        
        System.out.println("\n=== Metodo 3:Censurar datos ===");
        String textoEjemplo = "Llama a 5555-1234 o escribe a juan@usac.edu.gt para mas info.";
        System.out.println("Entrada: " + textoEjemplo);
        System.out.println("Salida: " + censurarDatos(textoEjemplo));
        
        System.out.println("\n--- Texto completo censurado ---");
        System.out.println(censurarDatos(TEXTO));
    }
    
    
}
