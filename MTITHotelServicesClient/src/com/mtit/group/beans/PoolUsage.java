/**
 * PoolUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.group.beans;

public class PoolUsage  implements java.io.Serializable {
    private java.lang.String day;

    private int hours;

    private int pid;

    private java.lang.String reasontobook;

    public PoolUsage() {
    }

    public PoolUsage(
           java.lang.String day,
           int hours,
           int pid,
           java.lang.String reasontobook) {
           this.day = day;
           this.hours = hours;
           this.pid = pid;
           this.reasontobook = reasontobook;
    }


    /**
     * Gets the day value for this PoolUsage.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this PoolUsage.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the hours value for this PoolUsage.
     * 
     * @return hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this PoolUsage.
     * 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Gets the pid value for this PoolUsage.
     * 
     * @return pid
     */
    public int getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this PoolUsage.
     * 
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }


    /**
     * Gets the reasontobook value for this PoolUsage.
     * 
     * @return reasontobook
     */
    public java.lang.String getReasontobook() {
        return reasontobook;
    }


    /**
     * Sets the reasontobook value for this PoolUsage.
     * 
     * @param reasontobook
     */
    public void setReasontobook(java.lang.String reasontobook) {
        this.reasontobook = reasontobook;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PoolUsage)) return false;
        PoolUsage other = (PoolUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            this.hours == other.getHours() &&
            this.pid == other.getPid() &&
            ((this.reasontobook==null && other.getReasontobook()==null) || 
             (this.reasontobook!=null &&
              this.reasontobook.equals(other.getReasontobook())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        _hashCode += getHours();
        _hashCode += getPid();
        if (getReasontobook() != null) {
            _hashCode += getReasontobook().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PoolUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.group.mtit.com", "PoolUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "pid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasontobook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "reasontobook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
