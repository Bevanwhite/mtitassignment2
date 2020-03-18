package com.mtit.group.service;

import com.mtit.group.beans.Applyleaves;
import com.mtit.group.beans.Customer;
import com.mtit.group.beans.Employee;
import com.mtit.group.beans.PoolUsage;

public interface CustomerService {
	
	public boolean addCutomer(Customer c);
	public boolean removeCutomer(int id);
	public Customer checkTheCutomerBill(int id);
	public Customer[] getallCustomerdetails();
	
	public boolean addEmployee(Employee e);
	public boolean removeEmployee(int id);
	public Employee checktheEmployeePayout(int eid);
	public Employee[] getallEmployeedetails();
	
	public boolean addleavecard(Applyleaves a);
	public Applyleaves seeleavecrad(int leid);
	public boolean removeleaveCard(int leid);
	public Applyleaves[] seeallleavecard();
	
	public boolean addpoolbooking(PoolUsage p);
	public boolean removepoolbooking(int pid);
	public PoolUsage seepoolbooking(int pid);
	public PoolUsage[] seeallpoolusage();

	
}


