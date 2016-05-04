package r03ex.ex06;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class DigitSequence<T> implements Iterator<T> {

    private List<T> arrayList;
    private int currentIndex;

    public DigitSequence(List<T> newArray) {
        this.arrayList = newArray;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < arrayList.size() && arrayList.get(currentIndex) != null;
    }

    @Override
    public T next() {
        return arrayList.get(currentIndex++);
    }

    @Override
    public void remove() {

    }

}
