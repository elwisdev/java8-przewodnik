package r03ex.ex06;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class ListIterator<T> implements Iterator<T> {

    private List<T> examples;  //ArrayList<Vector> will be set here
    private int index;

    public ListIterator(List<T> examples) {
        this.examples = examples;
        this.index = 0;
    }

    @Override
    public T next() {
        if(hasNext()) {
            return examples.get(index++);
        } else {
            throw new NoSuchElementException("There are no elements size = " + examples.size());
        }
    }

    @Override
    public boolean hasNext() {
        return !(examples.size() == index);
    }

    @Override
    public void remove() {
        if(index <= 0) {
            throw new IllegalStateException("You can't delete element before first next() method call");
        }
        examples.remove(--index);
    }
}

