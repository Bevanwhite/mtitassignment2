package com.mtit.group.service;

public class CustomerServiceImplProxy implements com.mtit.group.service.CustomerServiceImpl {
  private String _endpoint = null;
  private com.mtit.group.service.CustomerServiceImpl customerServiceImpl = null;
  
  public CustomerServiceImplProxy() {
    _initCustomerServiceImplProxy();
  }
  
  public CustomerServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServiceImplProxy();
  }
  
  private void _initCustomerServiceImplProxy() {
    try {
      customerServiceImpl = (new com.mtit.group.service.CustomerServiceImplServiceLocator()).getCustomerServiceImpl();
      if (customerServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerServiceImpl != null)
      ((javax.xml.rpc.Stub)customerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mtit.group.service.CustomerServiceImpl getCustomerServiceImpl() {
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl;
  }
  
  public com.mtit.group.beans.Customer checkTheCutomerBill(int id) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.checkTheCutomerBill(id);
  }
  
  public com.mtit.group.beans.Employee[] getallEmployeedetails() throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.getallEmployeedetails();
  }
  
  public com.mtit.group.beans.Employee checktheEmployeePayout(int eid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.checktheEmployeePayout(eid);
  }
  
  public boolean removepoolbooking(int pid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.removepoolbooking(pid);
  }
  
  public com.mtit.group.beans.Customer[] getallCustomerdetails() throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.getallCustomerdetails();
  }
  
  public boolean removeCutomer(int id) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.removeCutomer(id);
  }
  
  public boolean addCutomer(com.mtit.group.beans.Customer c) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.addCutomer(c);
  }
  
  public boolean addEmployee(com.mtit.group.beans.Employee e) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.addEmployee(e);
  }
  
  public boolean removeEmployee(int id) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.removeEmployee(id);
  }
  
  public boolean addleavecard(com.mtit.group.beans.Applyleaves a) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.addleavecard(a);
  }
  
  public com.mtit.group.beans.Applyleaves seeleavecrad(int leid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.seeleavecrad(leid);
  }
  
  public com.mtit.group.beans.Applyleaves[] seeallleavecard() throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.seeallleavecard();
  }
  
  public boolean removeleaveCard(int leid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.removeleaveCard(leid);
  }
  
  public com.mtit.group.beans.PoolUsage seepoolbooking(int pid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.seepoolbooking(pid);
  }
  
  public com.mtit.group.beans.PoolUsage[] seeallpoolusage() throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.seeallpoolusage();
  }
  
  public boolean addpoolbooking(com.mtit.group.beans.PoolUsage p) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.addpoolbooking(p);
  }
  
  
}