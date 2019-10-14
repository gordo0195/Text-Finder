/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author gordo-0195
 */

//ver 
public class Nodo <node extends Comparable<? super node>> {
    
    public node elemento;
    public Nodo<node> izquierda;
    public Nodo<node> derecha;
    
    public Nodo(node elemento){
        this(elemento, null, null);
    }
    
    public Nodo(node  elemento, Nodo<node> izquierda, Nodo<node> derecha){
    
        this.elemento = elemento;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
}
