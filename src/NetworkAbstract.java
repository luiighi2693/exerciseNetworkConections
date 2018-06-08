import java.util.ArrayList;
import java.util.List;

public abstract class NetworkAbstract implements NetworkInterface {
    protected List<ConnectedElementsGroup> groups = new ArrayList<ConnectedElementsGroup>();
    protected Integer total;

    abstract public void connect(Integer firstElement, Integer secondElement);
    abstract public Boolean query(Integer firstElement, Integer secondElement);
}
