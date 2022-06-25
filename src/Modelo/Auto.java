package Modelo;

//@authors: samaelhg (Adrián Hernández) karenCat (Karen Gonzaga)
public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private Double precio;
    private String matricula;
    private Integer year;
    private Boolean seguro;

    public Auto(String marca, String modelo, String color, Double precio, String matricula, Integer year, Boolean seguro) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.matricula = matricula;
        this.year = year;
        this.seguro = seguro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }
    
    public String info(){
        return "Marca: "+marca+
               "\nModelo: "+modelo+
               "\nColor: "+color+
               "\nPrecio: "+precio+
                "\nMatricula: "+matricula+
                "\nAño: "+year+
                "\nSeguro: "+seguro;
    }

}
