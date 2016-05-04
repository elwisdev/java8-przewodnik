package r03ex.ex06;

import java.util.Iterator;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class TypeSequence<Type> implements Iterable<Type> {

    private Type[] arrayList;
    private int currentSize;

    public TypeSequence(Type[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {

        Iterator<Type> it = new Iterator<Type>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
