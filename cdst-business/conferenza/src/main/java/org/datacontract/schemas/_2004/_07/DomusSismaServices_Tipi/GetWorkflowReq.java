/**
 * GetWorkflowReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.DomusSismaServices_Tipi;

public class GetWorkflowReq  extends org.datacontract.schemas._2004._07.DomusSismaServices_Tipi.BaseReq  implements java.io.Serializable {
    private java.lang.String numeroIntervento;

    private java.lang.String tipoProcesso;

    public GetWorkflowReq() {
    }

    public GetWorkflowReq(
           java.lang.String password,
           java.lang.String userID,
           java.lang.String numeroIntervento,
           java.lang.String tipoProcesso) {
        super(
            password,
            userID);
        this.numeroIntervento = numeroIntervento;
        this.tipoProcesso = tipoProcesso;
    }


    /**
     * Gets the numeroIntervento value for this GetWorkflowReq.
     * 
     * @return numeroIntervento
     */
    public java.lang.String getNumeroIntervento() {
        return numeroIntervento;
    }


    /**
     * Sets the numeroIntervento value for this GetWorkflowReq.
     * 
     * @param numeroIntervento
     */
    public void setNumeroIntervento(java.lang.String numeroIntervento) {
        this.numeroIntervento = numeroIntervento;
    }


    /**
     * Gets the tipoProcesso value for this GetWorkflowReq.
     * 
     * @return tipoProcesso
     */
    public java.lang.String getTipoProcesso() {
        return tipoProcesso;
    }


    /**
     * Sets the tipoProcesso value for this GetWorkflowReq.
     * 
     * @param tipoProcesso
     */
    public void setTipoProcesso(java.lang.String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkflowReq)) return false;
        GetWorkflowReq other = (GetWorkflowReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numeroIntervento==null && other.getNumeroIntervento()==null) || 
             (this.numeroIntervento!=null &&
              this.numeroIntervento.equals(other.getNumeroIntervento()))) &&
            ((this.tipoProcesso==null && other.getTipoProcesso()==null) || 
             (this.tipoProcesso!=null &&
              this.tipoProcesso.equals(other.getTipoProcesso())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNumeroIntervento() != null) {
            _hashCode += getNumeroIntervento().hashCode();
        }
        if (getTipoProcesso() != null) {
            _hashCode += getTipoProcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkflowReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "GetWorkflowReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIntervento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "NumeroIntervento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DomusSismaServices.Tipi", "TipoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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