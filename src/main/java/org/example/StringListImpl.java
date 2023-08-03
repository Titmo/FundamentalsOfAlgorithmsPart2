package org.example;

import org.example.exception.ElementNotFaund;
import org.example.exception.FullArrayException;
import org.example.exception.IndexException;
import org.example.exception.NullItemException;

import java.util.Arrays;

public class StringListImpl implements StringList {
    private final String[] array;
    private int size;

    public StringListImpl() {
        array = new String[10];
    }

    public StringListImpl(int sizeArray) {
        array = new String[sizeArray];
    }

    @Override
    public String add(String item) {
        checkItem(item);
        checkSize();
        array[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        checkItem(item);
        checkSize();
        checkIndex(index);
        if (index == size) {
            array[size++] = item;
        }
        System.arraycopy(array, index, array, index = +1, size - index);
        array[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        checkIndex(index);
        checkItem(item);

        array[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        checkItem(item);
        int index = indexOf(item);

        if (index == -1) {
            throw new ElementNotFaund();
        }
        if (index != size) {
            System.arraycopy(array, index + 1, array, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public String remove(int index) {
        checkIndex(index);

        String item = array[index];

        if (index != size) {
            System.arraycopy(array, index + 1, array, index, size - index);
        }
        size--;
        return null;
    }


    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(array, size);
    }

    private void checkItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    private void checkSize() {
        if (size == array.length) {
            throw new FullArrayException();
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > array.length) {
            throw new IndexException();
        }
    }

}
