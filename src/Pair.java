import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;
import java.util.List;

public class Pair {
    private Integer firstElement;
    private Integer secondElement;

    public Pair(Integer firstElement, Integer secondElement){
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public boolean has(Integer element){
        return (this.firstElement.equals(element)) || (this.secondElement.equals(element));
    }

    public Integer other(Integer element){
        if (this.firstElement.equals(element)) {
            return this.secondElement;
        }
        if (this.secondElement.equals(element)) {
            return this.firstElement;
        }

        throw new IllegalArgumentException("Wrong $element passed. Bug in Pair->other()");
    }

    public List<Integer> getElements(){
        return Arrays.asList(this.firstElement, this.secondElement);
    }
}
