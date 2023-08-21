
package detodosupermercadosa;


public class Producto implements Comparable <Producto> {
    
    private int codigo;
    private int precio;
    private String descripcion;
    private int stock;
    private Categoria rubro;

    public Producto(int codigo, int precio, String descripcion, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion=descripcion;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripción(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto t) {
        
        if (codigo == t.codigo) {
            return 0;
        }else if (codigo > t.codigo) {
            return 1;
        }else{
            return -1; 
        }
    }

}