
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface ClientInterface extends Remote
{
    void refreshList(Vector<String> names)throws RemoteException;
    void refreshArea(String msg)throws RemoteException;
}
