package Controlador;

//@authors: samaelhg (Adrián Hernández) karenCat (Karen Gonzaga)
import Modelo.Auto;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.TipoOrdenacion;

public class ControladorAuto {

    private ListaEnlazadaServices<Auto> listaAutos = new ListaEnlazadaServices();
    private ListaEnlazadaServices<Auto> list;
    public void crearAuto(String marca, String modelo, String color, Double precio, String matricula, Integer year, Boolean seguro) {
        listaAutos.insertarAlFinal(new Auto(marca, modelo, color,precio,matricula, year, seguro));
    }
    
    
    public void ordenar(String atributo, String metodo, String tipoOrd) throws Exception{
        TipoOrdenacion tipoOrdenacion = Enum.valueOf(TipoOrdenacion.class, tipoOrd);
        if (metodo.equals("METODO SHELL")) {       
            listaAutos.ordenarporMetodoShell(atributo, tipoOrdenacion);           
            System.out.println("Se realizo bien la ordenacion por el metodo shell");
            
        }else if (metodo.equals("QUICK SORT")) {
            listaAutos.getLista().quickSort(atributo, tipoOrdenacion);
            
            System.out.println("Se realizo bien la ordenacion por quickSort");
        }
    }
    
    public void buscar(String atributo, Object dato) throws Exception{
        this.list = listaAutos;
        list.setLista(list.getLista().busquedaBinaria(atributo, dato));
        
        System.out.println(list.getLista().obtenerDato(0).info());
        System.out.println("Se realizo bien la busqueda binaria");
    }
    public String[][] mostrarLista() throws PosicionException {

        String[][] list = new String[listaAutos.getSize()][7];
        for (int i = 0; i < listaAutos.getSize(); i++) {
            list[i][0] = "" + listaAutos.getLista().obtenerDato(i).getMarca();
            list[i][1] = "" + listaAutos.getLista().obtenerDato(i).getModelo();
            list[i][2] = "" + listaAutos.getLista().obtenerDato(i).getColor();
            list[i][3] = "" + listaAutos.getLista().obtenerDato(i).getPrecio()+"$";
            list[i][4] = "" + listaAutos.getLista().obtenerDato(i).getMatricula();
            list[i][5] = "" + listaAutos.getLista().obtenerDato(i).getYear();
            if (listaAutos.getLista().obtenerDato(i).getSeguro() == true) {
                list[i][6] = "Con Seguro";
            }else{
                list[i][6] = "Sin Seguro";
            }
        }
        return list;
    }

    public String[][] mostrarBusqueda() throws PosicionException {

        String[][] listx = new String[list.getSize()][7];
        for (int i = 0; i < list.getSize(); i++) {
            listx[i][0] = "" + list.getLista().obtenerDato(i).getMarca();
            listx[i][1] = "" + list.getLista().obtenerDato(i).getModelo();
            listx[i][2] = "" + list.getLista().obtenerDato(i).getColor();
            listx[i][3] = "" + list.getLista().obtenerDato(i).getPrecio()+"$";
            listx[i][4] = "" + list.getLista().obtenerDato(i).getMatricula();
            listx[i][5] = "" + list.getLista().obtenerDato(i).getYear();
            if (list.getLista().obtenerDato(i).getSeguro() == true) {
                listx[i][6] = "Con Seguro";
            }else{
                listx[i][6] = "Sin Seguro";
            }
        }
        return listx;
    }
    
    public ListaEnlazadaServices<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ListaEnlazadaServices<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }
}
