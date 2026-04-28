package tarea11;

import java.util.regex.Pattern;


public class Tarea11 {

  public static boolean validarCarnet(String carnet){
  
      Pattern pattern = Pattern.compile("\"^\\\\d{9}$\"");
      return pattern.matcher(carnet).matches();
  }
  
  public static boolean validarCorreo(String correo){
  
      Pattern pattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9._]*@usac\\.edu\\.gt$");
      return pattern.matcher(correo).matches();
  }
  
  public static boolean validarTelefono(String telefono){
  
      Pattern pattern = Pattern.compile("^[3-6]\\d{3}-?\\d{4}$");
      return pattern.matcher(telefono).matches();
  }
    public static void main(String[] args) {
        
        System.out.println("=== Pruebas Metodo 1:Carnet ===");
        System.out.println("202300123: " + validarCarnet("202300123"));   // Válido
        System.out.println("202512345: " + validarCarnet("202512345"));   // Válido
        System.out.println("20230012: " + validarCarnet("20230012"));     // Inválido
        System.out.println("2023ABC12: " + validarCarnet("2023ABC12"));   // Inválido
        
        System.out.println("\n=== Pruebas Metodo 2:Correo ===");
        System.out.println("juan.perez@usac.edu.gt: " + validarCorreo("juan.perez@usac.edu.gt")); // Válido
        System.out.println("carla_001@usac.edu.gt: " + validarCorreo("carla_001@usac.edu.gt")); // Válido
        System.out.println("juan@gmail.com: " + validarCorreo("juan@gmail.com")); // Inválido
        System.out.println(".juan@usac.edu.gt: " + validarCorreo(".juan@usac.edu.gt")); // Inválido
        
        System.out.println("\n=== Pruebas Metodo 3:Telefono ===");
        System.out.println("5555-1234: " + validarTelefono("5555-1234"));   // Válido
        System.out.println("30001234: " + validarTelefono("30001234"));     // Válido
        System.out.println("1234-5678: " + validarTelefono("1234-5678"));   // Inválido
        System.out.println("555-1234: " + validarTelefono("555-1234"));     // Inválido
      
    }
    
}
