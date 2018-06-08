import java.util.ArrayList;
import java.util.List;

abstract public class ConnectedElementsGroupAbstract {
    protected List<Integer> elements = new ArrayList<Integer>();

    abstract public void add(Pair pair);

    abstract public boolean contains(Pair pair);
}
