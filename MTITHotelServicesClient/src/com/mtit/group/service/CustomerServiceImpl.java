/**
 * CustomerServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.group.service;

public interface CustomerServiceImpl extends java.rmi.Remote {
    public com.mtit.group.beans.Customer checkTheCutomerBill(int id) throws java.rmi.RemoteException;
    public com.mtit.group.beans.Employee[] getallEmployeedetails() throws java.rmi.RemoteException;
    public com.mtit.group.beans.Employee checktheEmployeePayout(int eid) throws java.rmi.RemoteException;
    public boolean removepoolbooking(int pid) throws java.rmi.RemoteException;
    public com.mtit.group.beans.Customer[] getallCustomerdetails() throws java.rmi.RemoteException;
    public boolean removeCutomer(int id) throws java.rmi.RemoteException;
    public boolean addCutomer(com.mtit.group.beans.Customer c) throws java.rmi.RemoteException;
    public boolean addEmployee(com.mtit.group.beans.Employee e) throws java.rmi.RemoteException;
    public boolean removeEmployee(int id) throws java.rmi.RemoteException;
    public boolean addleavecard(com.mtit.group.beans.Applyleaves a) throws java.rmi.RemoteException;
    public com.mtit.group.beans.Applyleaves seeleavecrad(int leid) throws java.rmi.RemoteException;
    public com.mtit.group.beans.Applyleaves[] seeallleavecard() throws java.rmi.RemoteException;
    public boolean removeleaveCard(int leid) throws java.rmi.RemoteException;
    public com.mtit.group.beans.PoolUsage seepoolbooking(int pid) throws java.rmi.RemoteException;
    public com.mtit.group.beans.PoolUsage[] seeallpoolusage() throws java.rmi.RemoteException;
    public boolean addpoolbooking(com.mtit.group.beans.PoolUsage p) throws java.rmi.RemoteException;
}
