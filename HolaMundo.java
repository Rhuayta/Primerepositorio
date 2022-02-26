import java.util.Scanner;
class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Ingresa una palabra: ");
    Scanner scanner =new Scanner(System.in);
    String palabra = scanner.nextLine();
     System.out.println("Palabra ingresada: "+ palabra);
    char[] caracteres= palabra.toCharArray();    
  }
}