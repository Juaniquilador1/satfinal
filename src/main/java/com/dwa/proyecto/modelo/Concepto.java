// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="concepto")
public class Concepto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "idconcepto";

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int idconcepto;
    @Column(nullable=false, precision=10)
    private int claveproducto;
    @Column(nullable=false, precision=10)
    private int claveunidad;
    @Column(nullable=false, precision=10)
    private int cantidad;
    @Column(nullable=false, precision=10)
    private int unidad;
    @Column(nullable=false, precision=10)
    private int numeroidentificacion;
    @Column(nullable=false, length=50)
    private String descripcion;
    @Column(nullable=false, precision=10)
    private int valorunitario;
    @Column(nullable=false, precision=10)
    private int importe;
    @Column(nullable=false, precision=10)
    private int descuento;
    @Column(nullable=false, length=30)
    private String otros;
    @Column(nullable=false, precision=10)
    private int idcomprobante;

    /** Default constructor. */
    public Concepto() {
        super();
    }

    /**
     * Access method for idconcepto.
     *
     * @return the current value of idconcepto
     */
    public int getIdconcepto() {
        return idconcepto;
    }

    /**
     * Setter method for idconcepto.
     *
     * @param aIdconcepto the new value for idconcepto
     */
    public void setIdconcepto(int aIdconcepto) {
        idconcepto = aIdconcepto;
    }

    /**
     * Access method for claveproducto.
     *
     * @return the current value of claveproducto
     */
    public int getClaveproducto() {
        return claveproducto;
    }

    /**
     * Setter method for claveproducto.
     *
     * @param aClaveproducto the new value for claveproducto
     */
    public void setClaveproducto(int aClaveproducto) {
        claveproducto = aClaveproducto;
    }

    /**
     * Access method for claveunidad.
     *
     * @return the current value of claveunidad
     */
    public int getClaveunidad() {
        return claveunidad;
    }

    /**
     * Setter method for claveunidad.
     *
     * @param aClaveunidad the new value for claveunidad
     */
    public void setClaveunidad(int aClaveunidad) {
        claveunidad = aClaveunidad;
    }

    /**
     * Access method for cantidad.
     *
     * @return the current value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Setter method for cantidad.
     *
     * @param aCantidad the new value for cantidad
     */
    public void setCantidad(int aCantidad) {
        cantidad = aCantidad;
    }

    /**
     * Access method for unidad.
     *
     * @return the current value of unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * Setter method for unidad.
     *
     * @param aUnidad the new value for unidad
     */
    public void setUnidad(int aUnidad) {
        unidad = aUnidad;
    }

    /**
     * Access method for numeroidentificacion.
     *
     * @return the current value of numeroidentificacion
     */
    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    /**
     * Setter method for numeroidentificacion.
     *
     * @param aNumeroidentificacion the new value for numeroidentificacion
     */
    public void setNumeroidentificacion(int aNumeroidentificacion) {
        numeroidentificacion = aNumeroidentificacion;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for valorunitario.
     *
     * @return the current value of valorunitario
     */
    public int getValorunitario() {
        return valorunitario;
    }

    /**
     * Setter method for valorunitario.
     *
     * @param aValorunitario the new value for valorunitario
     */
    public void setValorunitario(int aValorunitario) {
        valorunitario = aValorunitario;
    }

    /**
     * Access method for importe.
     *
     * @return the current value of importe
     */
    public int getImporte() {
        return importe;
    }

    /**
     * Setter method for importe.
     *
     * @param aImporte the new value for importe
     */
    public void setImporte(int aImporte) {
        importe = aImporte;
    }

    /**
     * Access method for descuento.
     *
     * @return the current value of descuento
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Setter method for descuento.
     *
     * @param aDescuento the new value for descuento
     */
    public void setDescuento(int aDescuento) {
        descuento = aDescuento;
    }

    /**
     * Access method for otros.
     *
     * @return the current value of otros
     */
    public String getOtros() {
        return otros;
    }

    /**
     * Setter method for otros.
     *
     * @param aOtros the new value for otros
     */
    public void setOtros(String aOtros) {
        otros = aOtros;
    }

    /**
     * Access method for idcomprobante.
     *
     * @return the current value of idcomprobante
     */
    public int getIdcomprobante() {
        return idcomprobante;
    }

    /**
     * Setter method for idcomprobante.
     *
     * @param aIdcomprobante the new value for idcomprobante
     */
    public void setIdcomprobante(int aIdcomprobante) {
        idcomprobante = aIdcomprobante;
    }

    /**
     * Compares the key for this instance with another Concepto.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Concepto and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Concepto)) {
            return false;
        }
        Concepto that = (Concepto) other;
        if (this.getIdconcepto() != that.getIdconcepto()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Concepto.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Concepto)) return false;
        return this.equalKeys(other) && ((Concepto)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdconcepto();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Concepto |");
        sb.append(" idconcepto=").append(getIdconcepto());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idconcepto", Integer.valueOf(getIdconcepto()));
        return ret;
    }

}
