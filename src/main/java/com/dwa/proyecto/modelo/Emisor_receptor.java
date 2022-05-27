// Generated with g9.

package com.dwa.proyecto.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="emisor/receptor")
public class Emisor_receptor implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Primary key. */
    protected static final String PK = "idemirec";


    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int idemirec;
    @Column(nullable=false, length=30)
    private String nombre;
    @Column(nullable=false, length=50)
    private String regimen;
    @Column(nullable=false, length=40)
    private String tipofactura;
    @Column(nullable=false, length=20)
    private String clientefrecuente;
    @Column(nullable=false, length=30)
    private String usofactura;
    @Column(nullable=false, precision=10)
    private int idautor;

    /** Default constructor. */
    public Emisor_receptor() {
        super();
    }

    /**
     * Access method for idemirec.
     *
     * @return the current value of idemirec
     */
    public int getIdemirec() {
        return idemirec;
    }

    /**
     * Setter method for idemirec.
     *
     * @param aIdemirec the new value for idemirec
     */
    public void setIdemirec(int aIdemirec) {
        idemirec = aIdemirec;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for regimen.
     *
     * @return the current value of regimen
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * Setter method for regimen.
     *
     * @param aRegimen the new value for regimen
     */
    public void setRegimen(String aRegimen) {
        regimen = aRegimen;
    }

    /**
     * Access method for tipofactura.
     *
     * @return the current value of tipofactura
     */
    public String getTipofactura() {
        return tipofactura;
    }

    /**
     * Setter method for tipofactura.
     *
     * @param aTipofactura the new value for tipofactura
     */
    public void setTipofactura(String aTipofactura) {
        tipofactura = aTipofactura;
    }

    /**
     * Access method for clientefrecuente.
     *
     * @return the current value of clientefrecuente
     */
    public String getClientefrecuente() {
        return clientefrecuente;
    }

    /**
     * Setter method for clientefrecuente.
     *
     * @param aClientefrecuente the new value for clientefrecuente
     */
    public void setClientefrecuente(String aClientefrecuente) {
        clientefrecuente = aClientefrecuente;
    }

    /**
     * Access method for usofactura.
     *
     * @return the current value of usofactura
     */
    public String getUsofactura() {
        return usofactura;
    }

    /**
     * Setter method for usofactura.
     *
     * @param aUsofactura the new value for usofactura
     */
    public void setUsofactura(String aUsofactura) {
        usofactura = aUsofactura;
    }

    /**
     * Access method for idautor.
     *
     * @return the current value of idautor
     */
    public int getIdautor() {
        return idautor;
    }

    /**
     * Setter method for idautor.
     *
     * @param aIdautor the new value for idautor
     */
    public void setIdautor(int aIdautor) {
        idautor = aIdautor;
    }

    /**
     * Compares the key for this instance with another Emisor_receptor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Emisor_receptor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Emisor_receptor)) {
            return false;
        }
        Emisor_receptor that = (Emisor_receptor) other;
        if (this.getIdemirec() != that.getIdemirec()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Emisor_receptor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Emisor_receptor)) return false;
        return this.equalKeys(other) && ((Emisor_receptor)other).equalKeys(this);
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
        i = getIdemirec();
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
        StringBuffer sb = new StringBuffer("[Emisor_receptor |");
        sb.append(" idemirec=").append(getIdemirec());
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
        ret.put("idemirec", Integer.valueOf(getIdemirec()));
        return ret;
    }

}
