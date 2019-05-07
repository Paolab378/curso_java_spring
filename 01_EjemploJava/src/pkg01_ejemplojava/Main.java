
package pkg01_ejemplojava;


public class Main {

  
    public static void main(String[] args) {
      
        boolean condicion = 5 == 5 && true;
        
        if ( 3 > 5 ){
            if (condicion || false) {
            
            System.out.println("Es verdadero");
        }
    }else if (5<7){
        System.out.println("No se ejecuta"); 
    }else 
     System.out.println("Cualquier otro caso");

        
    char letra = 'A';
    switch (letra) {
    case 'A':
    System.out.println ("Aaaaaaa");
    break;
      case 'B':
    System.out.println ("Bbbbbbb");
    break;
      case 'C':
    System.out.println ("Cccccc");
    break;
}
    String formateado = nombreApell ("Edith", "Brodersen");
    
            System.out.println( formateado);
            
            Tucan miPajaro = new Tucan ();
            miPajaro.longitud = 20.5f;
            System.out.println("Long tucan: " + miPajaro.longitud);
            Tucan otroPajaro = new Tucan ();
            otroPajaro.longitud =30.9f;
            System.out.println("Mi Tucan:" + otroPajaro.longitud);
    }
     static String nombreApell (String nombre, String apellidos) {
         return apellidos + " , " + nombre;
        
                 
         
     }
}


