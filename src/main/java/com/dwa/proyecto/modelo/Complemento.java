// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="complemento")
public class Complemento implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Primary key. */
    protected static final String PK = "idcomplemento";

   
    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int idcomplemento;
    @Column(nullable=false, length=50)
    private String tipocomprobante;
    @Column(nullable=false, precision=10)
    private int rfc;

    /** Default constructor. */
    public Complemento() {
        super();
    }

    /**
     * Access method for idcomplemento.
     *
     * @return the current value of idcomplemento
     */
    public int getIdcomplemento() {
        return idcomplemento;
    }

    /**
     * Setter method for idcomplemento.
     *
     * @param aIdcomplemento the new value for idcomplemento
     */
    public void setIdcomplemento(int aIdcomplemento) {
        idcomplemento = aIdcomplemento;
    }

    /**
     * Access method for tipocomprobante.
     *
     * @return the current value of tipocomprobante
     */
    public String getTipocomprobante() {
        return tipocomprobante;
    }

    /**
     * Setter method for tipocomprobante.
     *
     * @param aTipocomprobante the new value for tipocomprobante
     */
    public void setTipocomprobante(String aTipocomprobante) {
        tipocomprobante = aTipocomprobante;
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
     * Compares the key for this instance with another Complemento.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Complemento and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Complemento)) {
            return false;
        }
        Complemento that = (Complemento) other;
        if (this.getIdcomplemento() != that.getIdcomplemento()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Complemento.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Complemento)) return false;
        return this.equalKeys(other) && ((Complemento)other).equalKeys(this);
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
        i = getIdcomplemento();
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
        StringBuffer sb = new StringBuffer("[Complemento |");
        sb.append(" idcomplemento=").append(getIdcomplemento());
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
        ret.put("idcomplemento", Integer.valueOf(getIdcomplemento()));
        return ret;
    }

}
