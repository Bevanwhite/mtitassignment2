/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.group.beans;

public class Employee  implements java.io.Serializable {
    private java.lang.String address;

    private int age;

    private float amountperhour;

    private int eid;

    private java.lang.String marriageStatus;

    private java.lang.String name;

    private float workinghoursperday;

    public Employee() {
    }

    public Employee(
           java.lang.String address,
           int age,
           float amountperhour,
           int eid,
           java.lang.String marriageStatus,
           java.lang.String name,
           float workinghoursperday) {
           this.address = address;
           this.age = age;
           this.amountperhour = amountperhour;
           this.eid = eid;
           this.marriageStatus = marriageStatus;
           this.name = name;
           this.workinghoursperday = workinghoursperday;
    }


    /**
     * Gets the address value for this Employee.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Employee.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the age value for this Employee.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this Employee.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the amountperhour value for this Employee.
     * 
     * @return amountperhour
     */
    public float getAmountperhour() {
        return amountperhour;
    }


    /**
     * Sets the amountperhour value for this Employee.
     * 
     * @param amountperhour
     */
    public void setAmountperhour(float amountperhour) {
        this.amountperhour = amountperhour;
    }


    /**
     * Gets the eid value for this Employee.
     * 
     * @return eid
     */
    public int getEid() {
        return eid;
    }


    /**
     * Sets the eid value for this Employee.
     * 
     * @param eid
     */
    public void setEid(int eid) {
        this.eid = eid;
    }


    /**
     * Gets the marriageStatus value for this Employee.
     * 
     * @return marriageStatus
     */
    public java.lang.String getMarriageStatus() {
        return marriageStatus;
    }


    /**
     * Sets the marriageStatus value for this Employee.
     * 
     * @param marriageStatus
     */
    public void setMarriageStatus(java.lang.String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }


    /**
     * Gets the name value for this Employee.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Employee.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the workinghoursperday value for this Employee.
     * 
     * @return workinghoursperday
     */
    public float getWorkinghoursperday() {
        return workinghoursperday;
    }


    /**
     * Sets the workinghoursperday value for this Employee.
     * 
     * @param workinghoursperday
     */
    public void setWorkinghoursperday(float workinghoursperday) {
        this.workinghoursperday = workinghoursperday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.age == other.getAge() &&
            this.amountperhour == other.getAmountperhour() &&
            this.eid == other.getEid() &&
            ((this.marriageStatus==null && other.getMarriageStatus()==null) || 
             (this.marriageStatus!=null &&
              this.marriageStatus.equals(other.getMarriageStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.workinghoursperday == other.getWorkinghoursperday();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += getAge();
        _hashCode += new Float(getAmountperhour()).hashCode();
        _hashCode += getEid();
        if (getMarriageStatus() != null) {
            _hashCode += getMarriageStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Float(getWorkinghoursperday()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.group.mtit.com", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountperhour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "amountperhour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "eid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriageStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "marriageStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workinghoursperday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.group.mtit.com", "workinghoursperday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
