package pe.edu.ulima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {

    //Atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_detalleventa;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "nombre", referencedColumnName = "nombre"),
        @JoinColumn(name = "precio", referencedColumnName = "precio")
    })
    //@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "id_venta", referencedColumnName = "Name"),       
    })
    //@JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    private Venta id_venta;
    @Column
    private String descripcion;
    @Column
    private int cantidad;
    @Column
    private float precioT;

    public DetalleVenta(int id_detalleventa, Producto id_producto, Venta id_venta, String descripcion, int cantidad, float precioT) {
        this.id_detalleventa = id_detalleventa;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioT = precioT;
    }

    public DetalleVenta() {
    }

    public int getId_detalleventa() {
        return id_detalleventa;
    }

    public void setId_detalleventa(int id_detalleventa) {
        this.id_detalleventa = id_detalleventa;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public Venta getId_venta() {
        return id_venta;
    }
}
