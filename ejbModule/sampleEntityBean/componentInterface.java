package sampleEntityBean;

import java.rmi.RemoteException;

public interface componentInterface extends javax.ejb.EJBObject{
	public Integer doCalculations(Integer inputs) throws RemoteException;
}
