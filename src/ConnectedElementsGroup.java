import java.util.ArrayList;
import java.util.List;

public class ConnectedElementsGroup extends ConnectedElementsGroupAbstract {
    public ConnectedElementsGroup(Pair pair){
        this.elements.addAll(pair.getElements());
    }

    @Override
    public void add(Pair pair) {
        List<Integer> aux = new ArrayList<>();

        for (Integer element : elements){
            if(pair.has(element)){
                aux.add(pair.other(element));
            }
        }

        this.elements.addAll(aux);
    }

    public boolean hasElement(Integer input){
        return this.elements.stream().filter(element -> element.equals(input)).findAny().orElse(null) != null;
    }

    @Override
    public boolean contains(Pair pair) {
        for(Integer element: elements){
            if (pair.has(element)){
                return true;
            }
        }
        return false;
    }
}
