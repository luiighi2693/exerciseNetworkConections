import java.util.Arrays;
import java.util.List;

public class Network extends NetworkAbstract{
    private Integer total;

    public Network(Integer total){
        Verifier.checkPositive(total);
        this.total = total;
    }

    public void connect(){

    }

    @Override
    public void connect(Integer firstElement, Integer secondElement) {
        Verifier.verify(total, firstElement, secondElement);

        Pair pair = new Pair(firstElement, secondElement);

        groups.forEach(group -> {
            if(group.contains(pair)){
                group.add(pair);
            }
        });

        this.groups.add(new ConnectedElementsGroup(pair));
    }

    @Override
    public Boolean query(Integer firstElement, Integer secondElement) {
        Verifier.verify(total, firstElement,secondElement);

        Pair pair = new Pair(firstElement, secondElement);
        List<Integer> elements = pair.getElements();
        List<Boolean> result = Arrays.asList(false, false);

        if (this.groups.isEmpty()){
            return false;
        }

        this.groups.forEach(group -> {
            if(group.hasElement(elements.get(0))){
                result.set(0, true);
            }

            if(group.hasElement(elements.get(1))){
                result.set(1, true);
            }
        });
        return result.get(0) && result.get(1);
    }
}
