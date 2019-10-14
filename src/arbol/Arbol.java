/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;


import java.util.LinkedHashMap;
/**
 *
 * @author gordo-0195
 */
public class Arbol<node extends Comparable<? super node>> {
    
    private Nodo<node> raiz;
    
    public Arbol(){
        
        this.raiz = null;
    
    
    }
    public boolean estaVacio(){
        return this.raiz == null;
    }
    
    public boolean  contiene(node element){
        return this.contiene(element, this.raiz);
    }
    
    public boolean contiene(node element, Nodo<node> BNode ){
        if (BNode == null){
            return false;
        }else{
            int comparaResul = element.compareTo(BNode.elemento);
            
            if (comparaResul < 0){
                return contiene(element, BNode.izquierda);
            }
            else if(comparaResul > 0){
              return contiene(element, BNode.derecha);  
            }
            else
                return true;
            
        }
    }
    
    private Nodo<node> encuentraMin(Nodo<node> BNode){
        if(BNode == null){
            return null;
        }
        else if(BNode.izquierda == null){
            return BNode;
        }else{
            return encuentraMin(BNode.izquierda);
        }
    }
    
    private Nodo<node> encuentraMax(Nodo<node> BNode){
        if(BNode != null){
            while (BNode.derecha != null){
                BNode = BNode.derecha;
            }
        }
        return BNode;
    }
    
    public void insertar(node element){
        this.raiz = this.insertar(element, this.raiz);
    }
    
    public Nodo<node> insertar(node element, Nodo<node> current){
        if (current == null){
            return new Nodo<node>(element, null, null);
        }
        int comparaResul = element.compareTo(current.elemento);
        if (comparaResul < 0){
            current.izquierda = this.insertar(element, current.izquierda);
        }
        else if (comparaResul > 0){
            current.derecha = this.insertar(element, current.derecha);
        }
        return current;
    }
    
    public void remover(node element){
        this.raiz = this.remover(element, this.raiz);
    }
    
    public Nodo<node> remover(node element, Nodo<node> BNode){
        if (BNode == null){
            return BNode;
        }
        int comparaResul = element.compareTo(BNode.elemento);
        
        if(comparaResul < 0){
            BNode.izquierda = remover(element, BNode.izquierda);
        }
        else if (comparaResul > 0){
            BNode.derecha = remover(element, BNode.derecha);
        }
        else if(BNode.izquierda == null && BNode.derecha == null){
            BNode.elemento = encuentraMin(BNode.derecha).elemento;
            BNode.derecha = remover(BNode.elemento, BNode.derecha);
        }
        else{
            BNode = BNode.izquierda != null ? BNode.izquierda : BNode.derecha;
        }
        return BNode;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol Principal = new Arbol();
        
    }
    
}
