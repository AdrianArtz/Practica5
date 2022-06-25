package controlador.tda.lista;

import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.TipoOrdenacion;

//@authors: samaelhg (Adrián Hernández), karenCat (Karen Gonzaga), sebastian

public class ListaEnlazadaServices <E> {
    
    private ListaEnlazada<E> lista;
    
    public ListaEnlazada<E> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<E> lista) {
        this.lista = lista;
    }
    
    public ListaEnlazadaServices() {
        this.lista = new ListaEnlazada<>();
    }
    
    public Boolean insertarAlInicio(E dato) {       
            lista.insertarCabecera(dato);
            return true;
       
    }
    public Boolean insertarAlFinal(E dato) {
        try {
            //lista.getSize() 1 
            lista.insertar(dato, lista.getSize() - 1);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    public Boolean insertar(E dato, Integer pos) {
        try {
            lista.insertar(dato, pos);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Integer getSize() {
        return lista.getSize();
    }
    
    public E obtenerDato(Integer pos) {
        try {
            return lista.obtenerDato(pos);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public Boolean eliminarCabecera() {
        try {
            lista.eliminarDato(0);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Boolean eliminarUltimo() {
        try {
            lista.eliminarDato(lista.getSize() - 1);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Boolean eliminarPosicion(Integer pos) {
        try {
            lista.eliminarDato(pos);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Boolean modificarDatoPosicion(Integer pos, E dato) {
        try {
            lista.modificarDato(pos, dato);
            return true;
        } catch (PosicionException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public ListaEnlazada<E> ordenarporSeleccion(String atributo, TipoOrdenacion tipoOrdenacion){
        try {
            return lista.ordenar_seleccion(atributo, tipoOrdenacion);
        } catch (Exception e) {
            return null;
        }   
    }
    public ListaEnlazada<E> ordenarporMetodoShell(String atributo, TipoOrdenacion tipoOrdenacion){
        try {
            return lista.metodoShell(atributo, tipoOrdenacion);
        } catch (Exception e) {
            return null;
        }   
    }
    public ListaEnlazada<E> ordenarporQuickSort(String atributo, TipoOrdenacion tipoOrdenacion){
        try {
            return lista.quickSort(atributo, tipoOrdenacion);
        } catch (Exception e) {
            return null;
        }   
    }
    
    public ListaEnlazada<E> busquedaBinaria(String atributo, Object dato){
        try {
            lista.busquedaBinaria(atributo, dato);
        } catch (Exception ex) {
        }
        return null;
        
    }
    public void limpiarLista() {
        lista.vaciar();        
    }
    
}
