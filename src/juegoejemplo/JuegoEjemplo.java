
package juegoejemplo;


public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Auto ford = new Auto("rojo", 10,5);
      
        for(int i=0;i<10;i++){
          ford.moverDerecha();
        }
        
        System.out.println("Posicion(X,Y)"+ford.getPosX()+" "+ford.getPosY());
      
      
        
        
        
    }
    
}
