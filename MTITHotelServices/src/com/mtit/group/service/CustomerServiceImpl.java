package com.mtit.group.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.mtit.group.beans.Applyleaves;
import com.mtit.group.beans.Customer;
import com.mtit.group.beans.Employee;
import com.mtit.group.beans.PoolUsage;

public class CustomerServiceImpl implements CustomerService{
	
	private static Map<Integer,Customer> customer = new HashMap<Integer,Customer>();
	private static Map<Integer,Employee> employee = new HashMap<Integer,Employee>();
	private static Map<Integer,Applyleaves> applyleaves = new HashMap<Integer,Applyleaves>();
	private static Map<Integer,PoolUsage> poolUsage = new HashMap<Integer,PoolUsage>();
	
	@Override
	public boolean addCutomer(Customer c) {
		if(customer.get(c.getCid()) != null) return false;
		customer.put(c.getCid(), c);
		return true;
	}
	@Override
	public boolean removeCutomer(int id) {
		if(customer.get(id) == null) return false;
		customer.remove(id);
		return true;
	}
	@Override
	public Customer checkTheCutomerBill(int id) {
		return customer.get(id) ;
	}
	@Override
	public Customer[] getallCustomerdetails() {
		Set<Integer> ids = customer.keySet();
		Customer[] c = new Customer[ids.size()];
		int i=0;
		for(Integer id: ids) {
			c[i] = customer.get(id);
		}
		return c;
	}
	@Override
	public boolean addEmployee(Employee e) {
		if(employee.get(e.getEid()) != null) return false;
		employee.put(e.getEid(), e);
		return true;
	}
	@Override
	public boolean removeEmployee(int id) {
		if(employee.get(id) == null) return false;
		employee.remove(id);
		return true;
	}
	@Override
	public Employee checktheEmployeePayout(int eid) {
		return employee.get(eid);
	}
	@Override
	public Employee[] getallEmployeedetails() {
		Set<Integer> ids = employee.keySet();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Integer id: ids) {
			e[i] = employee.get(id);
		}
		return e;
	}
	@Override
	public boolean addleavecard(Applyleaves a) {
		if(applyleaves.get(a.getLaid()) != null) return false;
		applyleaves.put(a.getLaid(), a);
		return true;
	}
	@Override
	public Applyleaves seeleavecrad(int leid) {
		return applyleaves.get(leid);
	}
	@Override
	public boolean removeleaveCard(int leid) {
		if(applyleaves.get(leid) == null) return false;
		applyleaves.remove(leid);
		return true;
	}
	@Override
	public Applyleaves[] seeallleavecard() {
		Set<Integer> ids = applyleaves.keySet();
		Applyleaves[] a = new Applyleaves[ids.size()];
		int i=0;
		for(Integer id: ids) {
			a[i] = applyleaves.get(id);
		}
		return a;
	}
	@Override
	public boolean addpoolbooking(PoolUsage p) {
		if(poolUsage.get(p.getPid()) != null) return false;
		poolUsage.put(p.getPid(), p);
		return true;
	}
	@Override
	public boolean removepoolbooking(int pid) {
		if(poolUsage.get(pid) == null) return false;
		poolUsage.remove(pid);
		return true;		
	}
	@Override
	public PoolUsage seepoolbooking(int pid) {
		return poolUsage.get(pid);
	}
	@Override
	public PoolUsage[] seeallpoolusage() {
		Set<Integer> ids = poolUsage.keySet();
		PoolUsage[] p = new PoolUsage[ids.size()];
		int i=0;
		for(Integer id: ids) {
			p[i] = poolUsage.get(id);
		}
		return p;
	}
}
