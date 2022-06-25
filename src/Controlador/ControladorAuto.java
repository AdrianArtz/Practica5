package Controlador;

//@authors: samaelhg (Adrián Hernández) karenCat (Karen Gonzaga)
import Modelo.Auto;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.TipoOrdenacion;

public class ControladorAuto {

    private ListaEnlazadaServices<Auto> listaAutos = new ListaEnlazadaServices();
    private ListaEnlazadaServices<Auto> list = new ListaEnlazadaServices();

    public void crearAuto(String marca, String modelo, String color, Double precio, String matricula, Integer year, Boolean seguro) {
        listaAutos.insertarAlFinal(new Auto(marca, modelo, color, precio, matricula, year, seguro));
    }

    public void ordenar(String atributo, String metodo, String tipoOrd) throws Exception {
        TipoOrdenacion tipoOrdenacion = Enum.valueOf(TipoOrdenacion.class, tipoOrd);
        if (metodo.equals("METODO SHELL")) {
            listaAutos.ordenarporMetodoShell(atributo, tipoOrdenacion);
            System.out.println("Se realizo bien la ordenacion por el metodo shell");
        } else if (metodo.equals("QUICK SORT")) {
            listaAutos.getLista().quickSort(atributo, tipoOrdenacion);

            System.out.println("Se realizo bien la ordenacion por quickSort");
        }
    }

    public void buscar(String atributo, Object dato) throws Exception {
        listaAutos.ordenarporMetodoShell(atributo, TipoOrdenacion.DESCENDENTE);
        list.setLista(listaAutos.busquedaBinaria(atributo, dato));
        System.out.println(list.getSize());
        System.out.println(list.getLista().obtenerDato(0).getMarca());
    }

    public String[][] mostrarLista(ListaEnlazadaServices<Auto> l) throws PosicionException {
        String[][] list = new String[l.getSize()][7];
        for (int i = 0; i < l.getSize(); i++) {
            list[i][0] = "" + l.getLista().obtenerDato(i).getMarca();
            list[i][1] = "" + l.getLista().obtenerDato(i).getModelo();
            list[i][2] = "" + l.getLista().obtenerDato(i).getColor();
            list[i][3] = "" + l.getLista().obtenerDato(i).getPrecio() + " $";
            list[i][4] = "" + l.getLista().obtenerDato(i).getMatricula();
            list[i][5] = "" + l.getLista().obtenerDato(i).getYear();
            if (l.getLista().obtenerDato(i).getSeguro() == true) {
                list[i][6] = "Con Seguro";
            } else {
                list[i][6] = "Sin Seguro";
            }
        }
        return list;
    }

    public ListaEnlazadaServices<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ListaEnlazadaServices<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public  ListaEnlazadaServices<Auto> getListaB(){
         return list;
    }
}
