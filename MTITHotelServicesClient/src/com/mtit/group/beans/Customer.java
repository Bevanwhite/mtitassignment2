/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.group.beans;

public class Customer  implements java.io.Serializable {
    private int age;

    private double amount;

    private int cid;

    private java.lang.String name;

    private int numberOfDays;

    private int numberOfPeople;

    private int roomNumber;

    public Customer() {
    }

    public Customer(
           int age,
           double amount,
           int cid,
           java.lang.String name,
           int numberOfDays,
           int numberOfPeople,
           int roomNumber) {
           this.age = age;
           this.amount = amount;
           this.cid = cid;
           this.name = name;
           this.numberOfDays = numberOfDays;
           this.numberOfPeople = numberOfPeople;
           this.roomNumber = roomNumber;
    }


    /**
     * Gets the age value for this Customer.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this Customer.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the amount value for this Customer.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Customer.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the cid value for this Customer.
     * 
     * @return cid
     */
    public int getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this Customer.
     * 
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
    }


    /**
     * Gets the name value for this Customer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Customer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfDays value for this Customer.
     * 
     * @return numberOfDays
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }


    /**
     * Sets the numberOfDays value for this Customer.
     * 
     * @param numberOfDays
     */
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    /**
     * Gets the numberOfPeople value for this Customer.
     * 
     * @return numberOfPeople
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }


    /**
     * Sets the numberOfPeople value for this Customer.
     * 
     * @param numberOfPeople
     */
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }


    /**
     * Gets the roomNumber value for this Customer.
     * 
     * @return roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }


    /**
     * Sets the roomNumber value for this Customer.
     * 
     * @param roomNumber
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.age == other.getAge() &&
            this.amount == other.getAmount() &&
            this.cid == other.getCid() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.numberOfDays == other.getNumberOfDays() &&
            this.numberOfPeople == other.getNumberOfPeople() &&
            this.roomNumber == other.getRoomNumber();
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
        _hashCode += getAge();
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += getCid();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getNumberOfDays();
        _hashCode += getNumberOfPeople();
        _hashCode += getRoomNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.group.mtit.com", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "numberOfDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPeople");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "numberOfPeople"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "roomNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
