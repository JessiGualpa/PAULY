/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author Cli
 */
public class ListaCircularPalabra {

    public void borrarlista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void recorrer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertar(String nueva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    class Nodo
    {
        String dato;
        Nodo enlace;
        public Nodo(String entrada){;}
        
    }
    public class ListaCircular{
        private Nodo Lc;
        public ListaCircular insertar(String entrada){;}
        public void eliminar(String entrada){
            
            Nodo actual;
            actual=Lc;
            while((actual.enlace !=Lc)&&!(actual.enlace.dato.equals(entrada)))
                if(!actual.enlace.dato.equals(entrada))
                    actual=actual.enlace;
            {
        //enlace de nodo anterior con el sieuiente nodo
        if(!actual.enlace.equals(entrada))
        actual=actual.enlace;
    }
    if(actual.enlace.dato.equals(entrada)){
        Nodo p;
        p= actual.enlace;
        if(Lc ==Lc.enlace)
            Lc=null;
        else
        {
            if(p==Lc)
            {
                Lc= actual;
            }
          actual.enlace =p.enlace;
        }
            p=null;
        }
        }
        public void borrarlista(){
            Nodo p;
            if(Lc !=null){
                p=Lc;
                do{
                    Nodo t;
                    t=p;
                    p=p.enlace;
                    t=null;
                }while(p !=Lc);
                
                }
            else
                System.out.println("lista vacia");
            Lc=null;
            }
        public void recorrer(){;}
        }
}
   

