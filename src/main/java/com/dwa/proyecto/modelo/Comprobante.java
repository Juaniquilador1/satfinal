// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="comprobante")
public class Comprobante implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Primary key. */
    protected static final String PK = "idcomprobante";


    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int idcomprobante;
    @Column(nullable=false, length=20)
    private String fecha;
    @Column(nullable=false, precision=10)
    private int codigopostal;
    @Column(nullable=false, precision=10)
    private int moneda;
    @Column(nullable=false, length=30)
    private String formapago;
    @Column(nullable=false, length=30)
    private String metodopago;
    @Column(nullable=false, length=30)
    private String tipocambio;
    @Column(nullable=false, precision=10)
    private int serie;
    @Column(nullable=false, precision=10)
    private int folio;
    @Column(nullable=false, precision=10)
    private int confirmacionfolio;
    @Column(nullable=false, precision=10)
    private int rfc;

    /** Default constructor. */
    public Comprobante() {
        super();
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
     * Access method for fecha.
     *
     * @return the current value of fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter method for fecha.
     *
     * @param aFecha the new value for fecha
     */
    public void setFecha(String aFecha) {
        fecha = aFecha;
    }

    /**
     * Access method for codigopostal.
     *
     * @return the current value of codigopostal
     */
    public int getCodigopostal() {
        return codigopostal;
    }

    /**
     * Setter method for codigopostal.
     *
     * @param aCodigopostal the new value for codigopostal
     */
    public void setCodigopostal(int aCodigopostal) {
        codigopostal = aCodigopostal;
    }

    /**
     * Access method for moneda.
     *
     * @return the current value of moneda
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Setter method for moneda.
     *
     * @param aMoneda the new value for moneda
     */
    public void setMoneda(int aMoneda) {
        moneda = aMoneda;
    }

    /**
     * Access method for formapago.
     *
     * @return the current value of formapago
     */
    public String getFormapago() {
        return formapago;
    }

    /**
     * Setter method for formapago.
     *
     * @param aFormapago the new value for formapago
     */
    public void setFormapago(String aFormapago) {
        formapago = aFormapago;
    }

    /**
     * Access method for metodopago.
     *
     * @return the current value of metodopago
     */
    public String getMetodopago() {
        return metodopago;
    }

    /**
     * Setter method for metodopago.
     *
     * @param aMetodopago the new value for metodopago
     */
    public void setMetodopago(String aMetodopago) {
        metodopago = aMetodopago;
    }

    /**
     * Access method for tipocambio.
     *
     * @return the current value of tipocambio
     */
    public String getTipocambio() {
        return tipocambio;
    }

    /**
     * Setter method for tipocambio.
     *
     * @param aTipocambio the new value for tipocambio
     */
    public void setTipocambio(String aTipocambio) {
        tipocambio = aTipocambio;
    }

    /**
     * Access method for serie.
     *
     * @return the current value of serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Setter method for serie.
     *
     * @param aSerie the new value for serie
     */
    public void setSerie(int aSerie) {
        serie = aSerie;
    }

    /**
     * Access method for folio.
     *
     * @return the current value of folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Setter method for folio.
     *
     * @param aFolio the new value for folio
     */
    public void setFolio(int aFolio) {
        folio = aFolio;
    }

    /**
     * Access method for confirmacionfolio.
     *
     * @return the current value of confirmacionfolio
     */
    public int getConfirmacionfolio() {
        return confirmacionfolio;
    }

    /**
     * Setter method for confirmacionfolio.
     *
     * @param aConfirmacionfolio the new value for confirmacionfolio
     */
    public void setConfirmacionfolio(int aConfirmacionfolio) {
        confirmacionfolio = aConfirmacionfolio;
    }

    /**
     * Access method for rfc.
     *
     * @return the current value of rfc
     */
    public int getRfc() {
        return rfc;
    }

    /**
     * Setter method for rfc.
     *
     * @param aRfc the new value for rfc
     */
    public void setRfc(int aRfc) {
        rfc = aRfc;
    }

    /**
     * Compares the key for this instance with another Comprobante.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Comprobante and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Comprobante)) {
            return false;
        }
        Comprobante that = (Comprobante) other;
        if (this.getIdcomprobante() != that.getIdcomprobante()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Comprobante.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Comprobante)) return false;
        return this.equalKeys(other) && ((Comprobante)other).equalKeys(this);
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
        i = getIdcomprobante();
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
        StringBuffer sb = new StringBuffer("[Comprobante |");
        sb.append(" idcomprobante=").append(getIdcomprobante());
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
        ret.put("idcomprobante", Integer.valueOf(getIdcomprobante()));
        return ret;
    }

}
