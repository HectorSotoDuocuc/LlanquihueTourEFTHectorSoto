package cl.LlanquihueTour.EFT.model;

public class Proveedor extends Persona{
    private String tipoDeProducto;
    private String tipoDeProveedor;

    public Proveedor(String rut, String nombre, int edad,Direccion direccion, String tipoDeProducto, String tipoDeProveedor) {
        super(rut, nombre, edad,direccion);
        this.tipoDeProducto = tipoDeProducto;
        this.tipoDeProveedor = tipoDeProveedor;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getTipoDeProveedor() {
        return tipoDeProveedor;
    }

    public void setTipoDeProveedor(String tipoDeProveedor) {
        this.tipoDeProveedor = tipoDeProveedor;
    }
}
