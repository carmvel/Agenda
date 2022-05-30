/**
 * SendDocumentiMISResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.DomusSismaServices_Tipi;

public class SendDocumentiMISResp  implements java.io.Serializable {
    private java.lang.String esitoInvio;

    private java.lang.String idMIS;

    private java.lang.Integer idRichiesta;

    public SendDocumentiMISResp() {
    }

    public SendDocumentiMISResp(
           java.lang.String esitoInvio,
           java.lang.String idMIS,
           java.lang.Integer idRichiesta) {
           this.esitoInvio = esitoInvio;
           this.idMIS = idMIS;
           this.idRichiesta = idRichiesta;
    }


    /**
     * Gets the esitoInvio value for this SendDocumentiMISResp.
     * 
     * @return esitoInvio
     */
    public java.lang.String getEsitoInvio() {
        return esitoInvio;
    }


    /**
     * Sets the esitoInvio value for this SendDocumentiMISResp.
     * 
     * @param esitoInvio
     */
    public void setEsitoInvio(java.lang.String esitoInvio) {
        this.esitoInvio = esitoInvio;
    }


    /**
     * Gets the idMIS value for this SendDocumentiMISResp.
     * 
     * @return idMIS
     */
    public java.lang.String getIdMIS() {
        return idMIS;
    }


    /**
     * Sets the idMIS value for this SendDocumentiMISResp.
     * 
     * @param idMIS
     */
    public void setIdMIS(java.lang.String idMIS) {
        this.idMIS = idMIS;
    }


    /**
     * Gets the idRichiesta value for this SendDocumentiMISResp.
     * 
     * @return idRichiesta
     */
    public java.lang.Integer getIdRichiesta() {
        return idRichiesta;
    }


    /**
     * Sets the idRichiesta value for this SendDocumentiMISResp.
     * 
     * @param idRichiesta
     */
    public void setIdRichiesta(java.lang.Integer idRichiesta) {
        this.idRichiesta = idRichiesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendDocumentiMISResp)) return false;
        SendDocumentiMISResp other = (SendDocumentiMISResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esitoInvio==null && other.getEsitoInvio()==null) || 
             (this.esitoInvio!=null &&
              this.esitoInvio.equals(other.getEsitoInvio()))) &&
            ((this.idMIS==null && other.getIdMIS()==null) || 
             (this.idMIS!=null &&
              this.idMIS.equals(other.getIdMIS()))) &&
            ((this.idRichiesta==null && other.getIdRichiesta()==null) || 
             (this.idRichiesta!=null &&
              this.idRichiesta.equals(other.getIdRichiesta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEsitoInvio() != null) {
            _hashCode += getEsitoInvio().hashCode();
        }
        if (getIdMIS() != null) {
            _hashCode += getIdMIS().hashCode();
        }
        if (getIdRichiesta() != null) {
            _hashCode += getIdRichiesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendDocumentiMISResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "SendDocumentiMISResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esitoInvio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "EsitoInvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMIS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "IdMIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRichiesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "IdRichiesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
