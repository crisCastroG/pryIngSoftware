
package modelo;

public class Producto {
    private int cod_prod;
    private String nombre_prod;
    private int precio_prod;
    private int stock;

   

    public Producto() {
    }

    public Producto(int cod_prod, String nombre_prod, int precio_prod) {
        this.cod_prod = cod_prod;
        this.nombre_prod = nombre_prod;
        this.precio_prod = precio_prod;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }
     public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
