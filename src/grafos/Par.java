/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author David
 */
public class Par {
    Nodo nodo1;
    Nodo nodo2;

    public Par(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    public Par(Nodo nodo1, Nodo nodo2) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }
    
    public Nodo getNodo1() {
        return nodo1;
    }

    public void setNodo1(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    public Nodo getNodo2() {
        return nodo2;
    }

    public void setNodo2(Nodo nodo2) {
        this.nodo2 = nodo2;
    }

    @Override
    public String toString() {
        return "Par{" + "nodo1=" + nodo1 + ", nodo2=" + nodo2 + '}';
    }
    
    
    
}


