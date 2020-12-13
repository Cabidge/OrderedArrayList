import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add a null into a NoNullArrayList.");
        }
        
        super.add(element);
        return true;
    }

    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add a null into a NoNullArrayList.");
        }

        super.add(index, element);
    }
}