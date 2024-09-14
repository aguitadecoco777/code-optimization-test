import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in); //creacion del objeto escaner
        System.out.println("Ingrese su edad ");
        int edadUsuario=escaner.nextInt();
        final int AGE_LIMIT =18;
        
        if (edadUsuario >= AGE_LIMIT) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }
    }
}
